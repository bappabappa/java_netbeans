package loopsumation;

import java.util.Scanner;

public class LoopStatement04
{
     public static void main(String[] args)  //odd number er summtion
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
            if (i%2!=0)  //change is here
            {
                sum =sum+i;
                System.out.println(" "+i);
                
            }
            
                  
        }
        System.out.println(); //new line er kaj ta korbe
        System.out.println("The sum is : "+sum);    //even number er sumation 
      
    }
    
}
