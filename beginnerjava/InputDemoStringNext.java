package beginnerjava;

import java.util.Scanner;


public class InputDemoStringNext
{
      public static void main(String[] args)
    {
      Scanner input = new Scanner (System.in);
      String name;
      System.out.println("Enter your name");
      name =input.nextLine();
      System.out.println("Welcome = "+ name);
      
      name =input.next();
      System.out.println("Welcome = "+ name);
     
     
      
         
    }
    
}
