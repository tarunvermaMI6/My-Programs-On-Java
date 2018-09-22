public class selection_sort {
 public static void main(String [] args)
 {
     int arr[]={22,11,99,88,9,7,42};
     selection_sort obj=new selection_sort();
     obj.sorting(arr);
  }
 
 public void swap(int[] arr, int firstIndex,int secondIndex)
 {
 int em=arr[firstIndex];
  arr[firstIndex] = arr[secondIndex];
 arr[secondIndex]=em;
 }
 public int minIndex(int[] arr,int startIndex)
 {
 int len=arr.length;
 int minV=arr[startIndex];
 int minI=startIndex;
 
 for(int i=startIndex+1; i<len; i++)
 {
 
if(minV>arr[i]){
    
    minV=arr[i];
    minI=i;
} 
 }
 return minI;
 }
 public void sorting(int[] arr)
 {
  int len=arr.length;
  for(int i=0; i<len-1; i++)
  {
  int index=minIndex(arr,i);
  swap(arr,i,index);
  }
  for(int i=0; i<len; i++)
  {
  System.out.print(arr[i]+" ");
  }
     
 }
 

}
