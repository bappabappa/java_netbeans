
package oop;  //main method 

public class Test {
    public static void main(String[] args) {
        Teacher teacher1; //object declare
        teacher1 =new Teacher();//object create
        
     
        //Teacher teacher1 =new Teacher(); //dynamic initilazition
        
       /* teacher1.name ="bappa saha";
        teacher1.gender = "male";
        teacher1.phone = 1786765337;*/
        
        System.out.println();  //  parameterised method;lec 79
        teacher1.setinformation("bappa saha"," male" ,88080);
        
        /*System.out.println("name : "+teacher1.name);
        System.out.println("gender: "+ teacher1.gender);
        System.out.println("phone: "+ teacher1.phone);*/
        
        System.out.println();
        teacher1.displayInformation();
        
        System.out.println();
        
         Teacher teacher2; //object declare
        teacher2 =new Teacher();
        
        teacher2.name ="bappar pori";
        teacher2.gender = "female";
        teacher2.phone = 1786765337;
        
        teacher2.displayInformation();
        
       /* System.out.println("name : "+teacher2.name);
        System.out.println("gender: "+ teacher2.gender);
        System.out.println("phone: "+ teacher2.phone);*/
    }
}
