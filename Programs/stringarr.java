public class stringarr {

public static void main(String[] args)
{
  String[] arr={"java","master","job","ready","java","java"};
  stringarr obj =new stringarr();
  int n = obj.arrsize(arr,"java");
  //System.out.println(n);
  
  obj.printarr(n,arr,"java");
    
}

public int arrsize(String[] Sarr,String targetstr)
{ int count =0;
  int len =Sarr.length;
  boolean b;
  for(int i=0; i<len; i++)
  {  
      String str =Sarr[i];
      b=str.equals(targetstr);
     if(b)
     {
     count =count;
     }
     else
     {
     count =count +1;
     }
  }
  return count;
}
public void printarr(int size,String[] strarr, String target)
{
  String [] newarr = new String[size];
  int len= strarr.length;
  boolean bool; 
  int index=0;
  for(int i=0; i<len; i++)
  {
  String pstr= strarr[i];
  bool=pstr.equals(target);
  if(bool==false)
  {
   newarr[index]= strarr[i];
   index++;
  }
  }
  for(int i=0; i<size; i++)
  {
  System.out.println(newarr[i]);
  }


}
    
}
