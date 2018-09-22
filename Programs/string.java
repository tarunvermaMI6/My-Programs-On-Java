
public class string {

public static void main(String[] args )
  {
      string obj=new string();
      
            
  String str="hello my lady"; 
  
  int len= str.length();
    boolean bool;
    String pstr="";
    
     for(int i=0; i<len; i++)
     {
     char ch= str.charAt(i);
     pstr=pstr+ch;
     bool= ch==' ' || i==len-1;
     if(bool==true)
     {
       String qstr=obj.reverse(pstr);
       System.out.print(qstr+" ");
       qstr="";
       pstr="";
        }
     }
  }

     
    
    public String reverse(String pstr)
     {
     int len1 =pstr.length();
     String mstr="";
     int len=len1-1;
     for(int i=0; i<len1; i++)
     {
    char ch=pstr.charAt(len);  
     mstr=mstr+ch;
     len--;
   }
     return mstr;
     }
     
 }
    
    
    

    


