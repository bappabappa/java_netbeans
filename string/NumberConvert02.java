
package string;

import java.util.Scanner;

public class NumberConvert02 {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        int decimal;
        System.out.println("enter any decimal number : ");
        decimal = obj.nextInt();
        
        String binary = Integer.toBinaryString(decimal);
        System.out.println(binary);
        
        
    }
}
