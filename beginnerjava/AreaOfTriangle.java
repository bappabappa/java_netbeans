package beginnerjava;

import java.util.Scanner;


public class AreaOfTriangle 
{
    public static void main(String[] args) 
    {
       Scanner input =new Scanner(System.in);
       double base,height,  area;
       
        System.out.print("Enter  base value : "); //taking  a value from user
        base =input.nextDouble();          //  store or scan the value to base
        
        System.out.print("Enter height value : "); //taking from user
        height =input.nextDouble();
        
        area =0.5*base*height;
        System.out.println("Area of triangle is = " +area);
       
    }
    
}
