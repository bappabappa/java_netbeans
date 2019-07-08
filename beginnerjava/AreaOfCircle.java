package beginnerjava;

import java.util.Scanner;


public class AreaOfCircle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double radius, area;
        
        System.out.println("Enter the radius of circle");
        radius =input.nextDouble();
        
        area =3.1416*radius*radius;
        System.out.println("Area of circle is = "+area);
        
        
    }
    
}
