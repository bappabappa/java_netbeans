package seriespart;

import java.util.Scanner;

public class MultiplicationTable00            
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("enter any number : ");
        num=input.nextInt();
        
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(num+"x"+i+ "= "+num*i);
        }
    }
    
}
