
package arraydemo;

import java.util.Arrays;

public class Srorting00
{
    public static void main(String[] args) {
        
        
        int[] number ={12,13,14,11,22};
        
        Arrays.sort(number);  // Acending means small to large;
        
         System.out.print("Acending : ");
           
        for (int i = 0; i < 5; i++)
        {
         
            System.out.print(" " +number[i]);
            
        }
        System.out.println();
        
           System.out.print("Dcending : ");
        
                                    //Decending
         for (int i = 4; i >=0; i--) {
             System.out.print(" " +number[i]);
        }
        
        
    }
    
}
