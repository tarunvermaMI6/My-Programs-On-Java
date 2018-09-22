public class pattern4 {
   
    public static void main(String[] args)
    {
    int n=4;
    
    String str = "" ;
    String pstr="";
    
    for(int i=1; i<=n; i++)
    {
        str=str+i;
        for(int j=1; j<i; j++)
        {
        pstr=j+pstr;
        
        }
    System.out.println(str+pstr);
    pstr="";
    }
    
    
    }
}
