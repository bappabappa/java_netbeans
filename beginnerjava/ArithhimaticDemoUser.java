
package beginnerjava;

import java.util.Scanner;


public class ArithhimaticDemoUser
{
      public static void main(String[] args)
    {
        int num1,num2, result;
        Scanner input =new Scanner(System.in);
        
        System.out.print("Enter first number : ");
        num1 = input.nextInt();
        System.out.print("Enter second number : ");
        num2 = input.nextInt();
        
        num1 =20;
        num2 = 10;
        result =num1+num2;
        System.out.println("Sumation = "+result);
        
        result =num1-num2;
        System.out.println("Subtraction = "+result);
        
        result =num1 * num2;
        System.out.println("Multipaction = "+result);
        
        result =num1 / num2;
        System.out.println("Divide = "+result);
        
        result =num1 % num2;
        System.out.println("Reminder = "+result);  //as 20/10=2, and no reminder so 0.
        
        
    }
    
}
