package seriespart;

import java.util.Scanner;

public class Multiple02   // 1*3*5...*n
{
     public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n , result =1;
        System.out.print("enter the last number : ");
        n=input.nextInt();
        
        for (int i = 1; i <=n; i=i+2)
        {
            System.out.print(i+ " ");
            result = result *i;
        }
        System.out.println();
        System.out.println(result);
    }
    
    
}
