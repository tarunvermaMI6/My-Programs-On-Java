import java.util.Scanner;
public class frequency {

public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
  String str="ababacbdef";
  frequency obj=new frequency();
  obj.print(str);
}
public void print(String str)
{
int len=str.length();
for(int i=0; i<len; i++)
{
    int index=0;
    int count=0;
    char ch=str. charAt(i);
  for(int j=0; j<len; j++)
  {
  char ch1=str.charAt(j);
   index =str.indexOf(ch);
   if(ch==ch1)
   {
   count=count+1;
   
   }
  
  }
  if(index==i){
  System.out.println(ch+":"+count);
  }
  count=0;
}
}

}
