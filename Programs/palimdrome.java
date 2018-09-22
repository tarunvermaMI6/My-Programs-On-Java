// 12321, 151,same on reversing...
public class palimdrome {
    
    public static void main(String[] args)
  
    {
        int n=124321;
        int m, temp ,sum=0;
        temp=n;
        while(n>0)
        {
        m=(n%10);
        sum=(sum*10)+m;
        n=n/10;
        }
        if(temp==sum)
        {
        System.out.println("palindrome");
        }
        else{
        
        System.out.println("not pali...");
        }
        
    }
}
