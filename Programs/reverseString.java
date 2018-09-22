import java.util.Scanner;
public class reverseString {
    
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);     
        String str=sc.nextLine();
        int len=str.length();
        String pstr="";
        for(int i=len-1; i>=0;i--){
        char ch=str.charAt(i);
        pstr=pstr+ch;
        
        }
        System.out.println(pstr);
    }
}
