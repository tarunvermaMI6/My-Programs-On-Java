//import java.util.HashSet;
public class combinationOfString {
public static void main(String[] args)
{
String str="ABC";
int len=str.length();
combinationOfString ob=new combinationOfString();
ob.permute(str,0,len-1);
  }
public void permute(String str,int start,int last ){

    if(start==last){
    System.out.println(str)
            ;
    }
    else
    {
    for(int i=start; i<=last; i++)
    {
    str=swap(str,start,i);
    permute(str,start+1,last);
    str=swap(str,start,i);
    
    }
    
    }
    
    
}
public String swap(String str,int start,int j )
{
char temp;
char[] charArray=

}


}

