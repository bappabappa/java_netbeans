package beginnerjava;

import java.util.Scanner;  // must written when line 11 is written


public class InputDemo 
{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        int number ;
        
        System.out.println("enter any number");  //user number dibe
        number =input.nextInt();   //value ta scan kore nilo
        System.out.println("Number = " +number);
        
        
    }
}
