

public class floyd_tri {
 
    
    public static void main(String[] args) 
    {
    int num=1;
    String str="";
     for(int i=1; i<=5; i++)
     {
        for(int j=1; j<=i; j++)
        {
        str =str+" "+num;
        num++;
        }
     System.out.println(str);
     str="";
     }
    
    }
}
