public class floyd_triangle {
  
  public static void main(String[] args)
  {
      String str="";
      int num=1;
     for(int i=1; i<=5; i++)
     {
    
        for(int j=1; j<=i; j++)
        {
        str=str +num;
        num=num+1;
        }
        System.out.println(str);
     }
  
  
  }
    
}
