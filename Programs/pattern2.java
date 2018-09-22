public class pattern2 {

public static void main(String[] args)
{
  String gstr ="hello";
  String  str= "";
  int len =gstr.length();
  int num = len-1;
  String hash ="";
   for(int i=0; i<len; i++)
   {
        char ch =gstr.charAt(num);
        str = str +ch;
        hash = hash + '#';
        System.out.println(str+hash);
        num--;
        
   
   }

}
    
}
