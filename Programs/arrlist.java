import java.util.ArrayList;
public class arrlist {
 

public static void main(String[] args)
{
  int[] arr= {10,20,25,30,35,55};
  
  arrlist obj=new arrlist();
         obj.printlist(arr);

}
public void printlist(int[] arr1)
{
ArrayList<Integer> list= new ArrayList<Integer>();

int len =arr1.length;
for(int i=0; i<len; i++)
{
if(arr1[i]%10==5)
{
 list.add(arr1[i]);

}


}
System.out.println(list);
}




}
