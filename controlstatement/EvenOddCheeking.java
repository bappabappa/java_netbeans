package controlstatement;

import java.util.Scanner;

public class EvenOddCheeking 
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    int num;
        System.out.println("enter any number");
        num=input.nextInt();
        if (num%2== 0) 
        {
            System.out.println("even");
        }
        else
            System.out.println("odd");
        
    
    }
    
}
