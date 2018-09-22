// diamond shape
public class pattern5 {
   
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
      for(int j=1; j<=(2*i)-1; j++)
      {
      System.out.print("*");
      
      }
      System.out.println();
     }
      //reverse
     for(int i=1; i<n; i++)
     {
    
      space=1;
      for(int k=1; k<=space; k++)
      {
      System.out.print(" ");
      }
      space++;
      
      for(int j=1; j<=2*(n-j)-1; j++ )
      {
      System.out.print("*");
      
      }
      System.out.println();
     }
    
     
     
     
     
    }
}
