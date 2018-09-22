
public class test {
public static void main(String[] args) 
    {
    String str="aabbcc";
   int len=str.length();
   String pstr="";
   
   for(int i=0; i<len; i++)
   {
   char ch=str.charAt(i);
   int index=str.indexOf(ch);
   System.out.println(index);
   if(index==i)
   {
       
       
    pstr=pstr+ch;
   }
   
   
   
   }  
  
  System.out.println(pstr);
  
    
    }    
}
