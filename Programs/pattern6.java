public class pattern6
{
  public static void main(String[] arsg)
  {
  String gstr="job ready";
  String str ="";
  String pstr ="";
  int len =gstr.length();
  boolean b;
  
  for(int i =0; i<len; i++)
  {
    char ch= gstr.charAt(i);
    b= ch==' ';
    
    if(b==false)
    {
    pstr=pstr+ch;
    }
    else
    {
    str=str +ch;
    }
  }
  System.out.println(pstr+str);
  
  
  }
    
    
}
