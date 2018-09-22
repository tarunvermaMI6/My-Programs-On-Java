

public class reverseOwnplace {
public static void main(String[] args)  
{
    String pstr="";
    String str="this is a boy " ;
    String space;
   String[] words=str.split(" ");
   
  int len=words.length;
  for(int i=0; i<len; i++)
  {
     pstr=words[i];
     reverseOwnplace obj=new reverseOwnplace();
     obj.reverse(pstr);
     //System.out.println(pstr);
     pstr="";
}
}
  public void reverse(String gstr)
  {
    int len=gstr.length();
    String mstr="";
    for(int i=len-1; i>=0; i--)
    {
       char ch=gstr.charAt(i);
        
    mstr=mstr+ch;
    }
    System.out.print(mstr+" ");
    mstr="";
  }
}  




