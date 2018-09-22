class Student{
 int totalmarks;
 String name;
 char grade;
  Student(int totalmarks,String name)
  {
    this.totalmarks=totalmarks;
    this.name=name;
    //this.grade =grade;
  
if(this.totalmarks > 450)
{
  this.grade='A';

}
else
{
 this.grade='B';
}
  }
   public void print()
   {
   System.out.println(this.grade);
   }
}
        
public class creatingobj {
    
    public static void main(String[] args)
    {
    //Student obj= new Student();
    //obj.name="amit";
    //obj.totalmarks=428;
  //  obj.grade='b';
//System.out.println(obj.name+":"+obj.totalmarks+":"+obj.grade);    
    Student obj=new Student(428,"amit");
    obj.print();
    }
    
}
