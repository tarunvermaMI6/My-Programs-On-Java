public class half_diamond {
  
    public static void main(String[] args)
    {
      int n=5;
      int space=n-1;
      for(int i=1; i<=n; i++)
      {
        for(int k=1; k<=space; k++)
        {
        System.out.print(" ");
        
        }
      space--;
      for(int j=1; j<(2*i); j++)
      {
      System.out.print("*");
      
      }
      System.out.println();
      }
    
    }
}
