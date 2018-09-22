public class pattern7
{
  public static void main(String[] arsg)
  {
  String gstr="job ready java";
  String str ="";
  
  int len =gstr.length();
  boolean b;
  for(int i=0; i<len; i++)
  {
   char ch= gstr.charAt(i);
   str=str+ch;
   b = ch==' ' || i==(len-1);
   if(b==true)
   {
   System.out.println(str);
   str ="";
   }
   
  }
  
  
  }
    
    
}
