package seriespart;

import java.util.Scanner;

public class MultiplicationTable01
{
     public static void main(String[] args) //nested loop
    {
        Scanner input = new Scanner(System.in);
        int m,n;
        System.out.println("enter initial number : ");
        m=input.nextInt();  // m=5
        
        System.out.println("enter final number : ");
        n=input.nextInt();  //n=10
        
        for (int i = m; i <=n; i++)  // outer loop e koto koto ghorer hbe ta cholbe
        {
             for (int j = 1; j <= 10; j++)     //time table cholar jonno
            {
            System.out.println(i+"x"+j+ "= "+i*j); // inner loop e namota hbe
            } 
             System.out.println("\n\n");
        }
        
        
      
    }
    
}
