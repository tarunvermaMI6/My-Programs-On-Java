public class pattern3 {
 
    public static void main(String[] args)
    {
        int num=5;
      int space=num-1;
       for(int i=1; i<=num; i++)
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
    }
}
