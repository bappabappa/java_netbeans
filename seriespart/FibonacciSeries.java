package seriespart;

import java.util.Scanner;

public class FibonacciSeries
{ 
    public static void main(String[] args) //without recarsion
    {
        Scanner input = new Scanner(System.in);
        System.out.println("how many number : ");
        int n =input.nextInt(); // direct amneoo nite parboo
        
         int first= 0;
         int second =1;
         int fibo;
         
         System.out.print(first+ " "+second); //technically 0,1 print kore dilam
         
         for (int i = 3; i <= n ; i++) //as we print two number so counting starts at 3
         {
             fibo= first+second;
             System.out.print(" " +fibo);
             first=second;
             second=fibo;
            
         }
         
        
        
    }
    
}
