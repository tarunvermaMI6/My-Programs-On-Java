public class patternimp {
   
    public static void main(String[] args)
    {
        int n=5;
        int num;
        for(int i=1; i<=n; i++ )
        {
          for(int j=1; j<=i; j++)
          {
          System.out.print(j);
           num=j;
          }
        for(int k=i; k>1; k--)
        {
        System.out.print(k-1);
        }
        System.out.println();
        }
         
    }
}
