
package basicjava;

public class Constructor {
    public static void main(String[] args) {
        
        
         Student obj =new Student(10,20);
         Student obj1 =new Student(50);
         obj.disp();
         obj1.dispa();
}
    }
    
    

class Student
{
int a, b;
Student(int x)
{
  a=x;
}
Student(int x ,int y)
{
a=x;
b=y;
}
void disp()
{
    System.out.println("value is A "+a);
    System.out.println("value is B "+b);
}
void dispa()
{
    System.out.println("W = "  +a);
}
}