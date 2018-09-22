
public class pattern3 {
   public static void main(String[] args)
   {
       int n =8;
   String str ="";
  for(int i =1; i<=n; i++)
  {
  if(i%3==1)
  {
  str =str+'M';
   }
  if(i%3==2)
  {
      str =str+'N';
    }
  if(i%3==0)
  {
      str =str+'O';
  }
  
  }
  System.out.println(str);
   
   }
}
