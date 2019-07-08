
package oop;   //templet class

public class Teacher {
    
    String name,gender;
    int phone;
       //parameterised method
    void setinformation(String n,String m,int ph)
    {
      name =n;
      gender =m;
      phone =ph;
    }
    
    void displayInformation()  //defult method
    {
       
         System.out.println("name : "+name);
        System.out.println("gender: "+ gender);
        System.out.println("phone: "+ phone);
    }       
            
}
