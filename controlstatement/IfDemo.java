
package controlstatement;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.println("Enter any Integer : ");
        num =input.nextInt();
        
        if (num>=0)
        {
            System.out.println("positive"); 
        }
        
        
    }
    
}
