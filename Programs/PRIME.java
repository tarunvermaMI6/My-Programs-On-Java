import java.util.Scanner;
public class prime {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("number should be greater then 1 and 0");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    for(int i=num1; i<=num2; i++)
    {
    prime obj=new prime();
    if((num1==0||num1==1)||(num2==0||num2==1))
            {
            System.out.println("not prime");
            }
    else{
    obj.checkprime(i);
    }
       }
    
    }
    public void checkprime(int number){
     int mum=number/2;
     int count=0;
     int i;
        for(i=2; i<=mum; i++)
        {
          if(number%i==0)
          {
          count=count+1;
          break;
          }
        
        }
    if(count==1)
    {
     System.out.println(number+" ");   
    }
    
    }
    
    
    
}
