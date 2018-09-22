//0 1 1 2 3 5 8 13....n1+n2...
public class FIBONACCI {
    
    public static void main(String[] args)
    {
       int n=8;
       int s1=0, s2=1, s3;
       System.out.print(s1);
       //System.out.print(" ");
       System.out.print(","+s2);
       for(int i=1; i<n-2; i++)
       {
          s3=s1+s2;
          System.out.print(","+s3);
          s1=s2;
          s2=s3;
       }
    
    
    }
}
