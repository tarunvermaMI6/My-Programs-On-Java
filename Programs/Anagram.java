import java.util.Scanner;
public class Anagram {
 
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str1=(sc.nextLine()).toLowerCase();
    String str2=(sc.nextLine()).toLowerCase();
   
    Anagram obj=new Anagram();
    obj.check(str1,str2);
     }
    public void check(String str,String pstr){
      int len1=str.length();
      int len2=pstr.length();
      
        if(len1==len2){
        String gstr="";
        int count=0;
   for(int i=0; i<len1; i++)
        {
        char strch=str.charAt(i);
           for(int j=0; j<len1; j++)
           {
           char pstrch=pstr.charAt(j);
           if(strch==pstrch)
           {
           count=count+1;
           gstr=gstr+'#';
           }
           else{
           
           gstr=gstr+pstrch;
               }
           }
        pstr="";
        pstr=gstr;
        gstr="";
        
        }
   if(count==len1)
   {
   System.out.println("Anagram");
   }
   else{
   System.out.println("not anagram");
   
   }
          }
        else{
        System.out.println("not anagram");
        }    
    
    
    }
    
    
}
