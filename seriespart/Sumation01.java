package seriespart;

import java.util.Scanner;

public class Sumation01 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int n, sum=0;
        System.out.print("Enter the last number : "); // n ;
        n=input.nextInt();
        
        for (int i = 1; i <= n; i++) 
         {
             System.out.print( i+ " "); // i er value print korar jonnoo
            sum =sum+i;
         }
        System.out.println("=");
        System.out.println(sum);
        
    }
    
}
