
package oop;

public class Teacher79 {
    
     String name, gender;
     int phone;
    
    void setInformation(String n,String m,int ph)
    {
      name =n;    // parameterised method
      gender = m;
      phone = ph;
    
    }
    
    void displayInformation()
    {
          System.out.println("name : "+name);
         System.out.println("gender : "+gender);
         System.out.println("mobile number : "+phone);
         System.out.println("\n");
    } 
    
}
