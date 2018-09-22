public class insertion_sort {
    
    public static void main(String[] args)
    {
    int[] arr={22,11,99,88,9,7,42};
    insertion_sort obj=new insertion_sort();
    obj.insertionSort(arr);
    
    }
    
  public void insert(int[] arr,int lastIndex,int targetValue)
    {   
        int j=0;
        int len=arr.length;
        for(int i=lastIndex; i>=0; i--)
        {
             j=i;
        if(arr[i]<=targetValue)
        {
        
          break;
      }
        else
        {
        arr[i+1]=arr[i];
        }
        
        }
        arr[j+1]=targetValue;
    }
    public void insertionSort(int[] arr)
    {
    int len=arr.length;
    for(int i=1; i<len; i++)
    {
    insert(arr,i-1,arr[i]);
    
    }
    for(int i=0; i<len; i++)
    {
    System.out.print(arr[i]+" ");
    }
    
    }
    
    
    
}
