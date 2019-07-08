package arraydemo;

import java.util.Scanner;  // bappi bari ja

public class Matrix02    // matrix er sumation;
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
        
      int[][]A =new int [2][3];   
      int[][]B =new int [2][3]; 
      int[][]C =new int [2][3];   // sum k rakar jonno
      
        System.out.println("please enter elements for A matrix ");
     
           // getting input for A matrix
        for (int row = 0; row < 2; row++) {
            
            for (int col = 0; col < 3; col++) {
                
                System.out.printf("A[%d][%d] = " , row,col);
                A[row][col]=input.nextInt();
            }
        }
        
         System.out.println("please enter elements for B matrix ");
         // getting input for B matrix
        for (int row = 0; row < 2; row++) {
            
            for (int col = 0; col < 3; col++) {
            
                System.out.printf("B[%d][%d]= " , row,col);
                B[row][col]=input.nextInt();
            }
        }
         
        // printing A matrix
        System.out.print("A= ");  // print use korbo
        for (int row = 0; row < 2; row++) {
            
            for (int col = 0; col < 3; col++) {
                
                System.out.print(" \t"+A[row][col]);  //\t dibo
            }
            System.out.println();
        }
         
        System.out.println("\n\n");  // A,B matrix er majer gap er jonno
        // printing B matrix
        System.out.print("B= ");
        for (int row = 0; row < 2; row++) {
            
            for (int col = 0; col < 3; col++) {
                
                System.out.print("\t "+B[row][col]);
            }
            System.out.println();
        }
        
        
        // adding A and B matrix
        System.out.println("A+B = ");
        for (int row = 0; row < 2; row++) {
            
            for (int col = 0; col < 3; col++) {
                
                C[row][col] =A[row][col] +B [row][col];
                System.out.print(" \t "+ (C[row][col]));
            }
            System.out.println();
        }
        
        
         // subtraing A and B matrix
        System.out.println("A-B = ");
        for (int row = 0; row < 2; row++) {
            
            for (int col = 0; col < 3; col++) {
                
                C[row][col] =A[row][col] - B [row][col];
                System.out.print(" \t "+ (C[row][col]));
            }
            System.out.println();
        }
        
     
    }
    
}
