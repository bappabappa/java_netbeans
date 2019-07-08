package seriespart;
 
import java.util.Scanner;

public class Sumation04   // 1.5+2.5+3.5+...+n
{
   public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double n, sum=0;
        System.out.print("Enter the last number : "); // n ;
       n = input.nextDouble();
        
        for (double i = 1.5; i <= n; i=i+1) 
         {
             System.out.print( i+ " "); // i er value print korar jonnoo
            sum =sum+i;
         }
        System.out.println("=");
        System.out.println(sum);
        
    }
    
}
