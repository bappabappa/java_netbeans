 package arraydemo;

import java.util.Scanner;

public class ArrayOutput01 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int [][]number = new int [4][]; //coloumn number bollam na
        int k=0;
        
        number[0] = new int[0];
        number[1] = new int[2];   //coloumn sokkaa
        number[2] = new int[3];
        number[3] = new int[4];
    
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col <row+1; col++)
            {
                               
                number[row][col]=k;
                k++;
                
            }
        }
           //printing  the array
        
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < row+1; col++) {
                System.out.print( " "+number[row][col]); 
            }
                System.out.println();
        }
        
        
       
        
    }
   
}
