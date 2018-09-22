public class STAR_TRIANGLE {
 
     public static void main(String[] args)
     {
       int n=5;
       int space =n-1;//2*n-2;// space more than n
        for(int i=1; i<=n; i++ )
        {
            for(int j=1; j<=space; j++ )
            {
            System.out.print(" ");
            
            }
            space--;
            for(int k=1; k<=i; k++)
            {
             System.out.print("*");
            System.out.print(" ");
            }
            System.out.println();
         
        }
     
     }
}
