public class armstrong {
  
    public static void main(String [] args)
    {
    int n=421,temp=n;
    int m,sum=0;
    
    while(n>0)
    {
    m=n%10;
    sum=sum+(m*m*m);
    n=n/10;
    }
    if(sum==temp)
    {
    System.out.println("ARMSTRONG");
    
    }
    else{
    System.out.println("not armstrong");
    }
    
    }
}
