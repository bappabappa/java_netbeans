
package beginnerjava;

import java.util.Scanner;

public class CelsiusTemperature 
{
    public static void main(String[] args)  //main method
    {
        Scanner input =new Scanner(System.in);
        double faran,cels;
        
        System.out.println("Enter value of faranheight");
        cels =input.nextDouble();
        
       cels =.56 *cels +32;
        System.out.println("value of Celsius = "+cels);
        
        
    }
    
}
