  
package datetime;

import java.util.Random;

public class RandomNumber03 {
    
    public static void main(String[] args) {
        
        Random rand =new Random();
        
        
        int randoNumber = (int) (Math.random()*10)+ 1;   // 0-9 porjonto jabe
        System.out.println("Random numbr = "+randoNumber);
    }
    
}
