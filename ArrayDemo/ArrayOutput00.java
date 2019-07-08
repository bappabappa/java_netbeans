
package arraydemo;

import java.util.Scanner;

public class ArrayOutput00
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int[][]number=new int[4][5];
        int k=0;
        
        
        // assaning the value of 2D array
        for (int row = 0; row < 4; row++) {          
            for (int col = 0; col <5; col++) {
                number[row][col]=k;
                k++;
            }
        }
            //printing the elements
            for (int row = 0; row <4; row++) {
                for (int col = 0; col <5; col++) {
                    System.out.print(" "+number[row][col]); //nunber er value print korbo
                }
                System.out.println();
        }
        
        
        
    }   
    
    
    
    
    
}
