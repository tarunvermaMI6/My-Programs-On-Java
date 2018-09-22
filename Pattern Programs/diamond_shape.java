
public class diamond_shape {

 public static void main(String[] args)
 {
    int n=5;
    int num=n-1;
    String space="";
    String str="";
    for(int i=1; i<=n; i++)
    {
    
         for(int j=0; j<num; j++)
         {
         space=space+" ";
         }
    for(int k=1; k<=i; k++)
    {
    str=str+"*";
    
    }
    System.out.println(space+str);
    space="";
    str="";
    num--;
    }
 }
}
