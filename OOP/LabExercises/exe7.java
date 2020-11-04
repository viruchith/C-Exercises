/*

*/
interface IntOperations{
    public void factorial();
    public void evenOdd();
    public void isNegative();
    public void isPrime();
    public void sumOfDigits();
}

class MyNumber implements IntOperations{
    
    private int num;
    
    MyNumber(){
        this.num = 0 ;
    }
    
    MyNumber(int num){
        this.num = num ;
    }
    
    public void evenOdd(){
        if(num%2 == 0){
            System.out.println(num+" is a Even Number");
            
        }else{
            System.out.println(num+" is a Odd Number");
        }
    }
    
    public void factorial(){
        int fact = 1;
        
        for(int i = 1 ; i<=num ; i++){
            fact*=i ;
        }
        
        System.out.println("The factorial of "+num+" is "+fact);
    }
    
    public void isNegative(){
        if(num>0){
            System.out.println(num+" is a Positive Number");
            
        }else{
            System.out.println(num+" is a Negative Number");
        }
    }
    
    public void isPrime(){
        int flag = 0 ;
        
        for (int i = 2;i<num ;i++){
            if(num%i==0){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println(num+" is not a Prime Number");
            
        }else{
            System.out.println(num+" is a Prime Number");
        }
        
    }
    
    public void sumOfDigits(){
        int sum = 0 ;
        
        while(num>0){
            sum+=(num%10);
            num/=10 ;
        }
        
        System.out.println("Sum of it's digits is "+sum);
    }
    
}

public class Main{
    public static void main (String[] args) {
        MyNumber m=new MyNumber(11);
        m.isNegative();
        m.evenOdd();
        m.isPrime();
        m.factorial();
        m.sumOfDigits();
        
        System.out.println();
        
        MyNumber n = new MyNumber(14);
        n.isNegative();
        n.evenOdd();
        n.isPrime();
        n.factorial();
        n.sumOfDigits();
        
        
    }
}
