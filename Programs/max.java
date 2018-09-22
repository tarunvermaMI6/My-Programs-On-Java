public class max {
   public static void main(String[] args )
   {
   int[] arr ={179,256,9};
   int [] arr1 ={999,299,399};
   int len= arr.length;
   int max= arr[0];
   int min= arr1[0];
   
   for(int i=0; i<len; i++)
   {
    if(max < arr[i])
    {
    max = arr[i];
    
   }
    if(min > arr1[i])
    {
        min = arr1[i];
    }
   }
   System.out.println(max);
   System.out.println(min);
   }
}
