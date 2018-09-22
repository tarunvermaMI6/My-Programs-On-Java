public class reverse_diamond {

public static void main(String[] args)
{
     int n=5;
     int space=1;
     
     for(int i=n; i>=1; i--)
     {
        for(int j=1; j<=space; j++)
        {
          System.out.print(" ");
        }
        space++;
        for(int k=1; k<(i*2); k++)
        {
        System.out.print("*");
        
       }
        System.out.println();
     }
     

}
}
