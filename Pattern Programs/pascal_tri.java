public class pascal_tri {
  
    public static void main(String[] args)
    {
        int i,j,num=1;
        String str="";
       for(i=0; i<5; i++)
       {
           num=1;
           
        for(j=0; j<=i; j++)
        {
        str=str+" "+num;
        num=num*(i-j)/(j+1);
        
        }
        System.out.println(str);
        str="";
       }
       
        
    
    }
}
