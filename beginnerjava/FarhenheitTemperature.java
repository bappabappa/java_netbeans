package beginnerjava;

import java.util.Scanner;

public class FarhenheitTemperature
{
    public static void main(String[] args)  //main method
    {
        Scanner input =new Scanner(System.in);
        double cels,faran;
        
        System.out.println("Enter value of celsius");
        cels =input.nextDouble();
        
        faran =1.8 *cels +32;
        System.out.println("value of Faranheight = "+faran);
        
        
    }
    
}
