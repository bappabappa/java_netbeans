package beginnerjava;
public class UnaryIncrementDecrement 
{
    public static void main(String[] args)
    {
        int x=25;
        int y;
        
      
        
        y=x++; //postfix
        System.out.println("value of Y = "+y);  //here x=25=Y
        
        y=x;     //second x e value one plus hbee:)
        System.out.println("value of Y = "+y); //here x=26=Y
        
        y=++x;  //pre increment
        System.out.println("Value of Y = "+y); // y=27 
        
        y=x;
        System.out.println("Value of Y = "+y);  //y=27
        
    }
    
}
