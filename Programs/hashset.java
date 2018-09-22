import java.util.HashSet;
public class hashset {

  public static void main(String[] args)
  {
   String[] arr={"hello","how","are","you"};
   HashSet<String> set =new HashSet<String>();
   
   int len=arr.length;
   for(int i=0; i<len; i++)
   {
       String str=arr[i];
       int len1=str.length();
       for(int j=0; j<len1; j++)
       {
       char ch= str.charAt(j);
       String pstr="";
       pstr=pstr+ ch;
       set.add(pstr);
       
       }
   
   }
   
   System.out.println(set);
  
  
 }
}
