
package oop;

public class Teacher80
{
    
     String name, gender;
     int phone;
      
     Teacher80(String x,String y,int z) //constructor
     {
       name =x;
       gender = y;
       phone= z;
     
     }
   
    void displayInformation()
    {
          System.out.println("name : "+name);
         System.out.println("gender : "+gender);
         System.out.println("mobile number : "+phone);
         System.out.println("\n");
    } 
}
