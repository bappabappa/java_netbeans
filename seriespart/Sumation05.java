package seriespart;
 
import java.util.Scanner;

public class Sumation05   // 1^2+2^3+3^2+.....+n^2
{
   public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
       int n, sum=0;
        System.out.print("Enter the last number : "); // n ;
       n = input.nextInt();
        
        for (int i = 1; i <= n; i=i+1) 
         {
             System.out.print( i+"x"+i+" "); // i er value print korar jonnoo
            sum =sum+i*i; //change is here
         }
        System.out.println("=");
        System.out.println(sum);
        
    }
    
}
