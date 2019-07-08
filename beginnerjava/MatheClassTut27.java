package beginnerjava;

public class MatheClassTut27
{
    public static void main(String[] args) //main method
    {
        int x = 2;
        int y = 3 ;  // takin two input :)
       // int result;  // variable rakar jonno. na niloy hbe
       
       
       int max =Math.max(x, y);
        System.out.println("maximum = " +max); // using mathe max method
        
        int min =Math.min(x, y);
        System.out.println("minimum = "+ min); // using mathe min method
        
        int absolute = Math.abs(y);
        System.out.println("Absolute of Y = "+absolute); //
        
        double power =Math.pow(x, y);
        System.out.println("x to the power y = "+power);
        
        int round = Math.round(8.8f);
        System.out.println("round of 8.8 = "+round);
        
    }
    
}
