public class newarr {
 
    public static void main(String [] args)
    {
    int[] arr ={1,0,0,22};
    int len = arr.length;
    int count= 0;
    for(int i=0; i<len; i++)
    {
      if(arr[i]!=0)
      {
      count =count +1;
      }
    
    }
    int[] newarr =new int[count];
    int index =0;
     for(int i=0; i<len; i++)
     {
        if(arr[i]!=0)
        {
        newarr[index]=arr[i];
        
       System.out.println(newarr[index]);
       index++; }
     }
    
    
    
    
    
    
    
    
    }
}
