package loopsumation;

import java.util.Scanner;

public class LoopSumation02 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int sum =0;
        int m,n;
        System.out.println("enter initial number : ");
        m =input.nextInt();
        
        System.out.println("enter final number : ");
        n =input.nextInt();
        
        
        for (int i = m; i <= n; i++)
        {
            if (i%2==0)
            {
                sum =sum+i;
                
            }
            
                  
        }
        System.out.println("The sum is : "+sum);    //even number er sumation 
      
    }
    
}
