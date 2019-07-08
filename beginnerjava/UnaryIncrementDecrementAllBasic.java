package beginnerjava;

public class UnaryIncrementDecrementAllBasic
{
      public static void main(String[] args)
    {
        int x=25;
        int y;
        
        y =--x; //prefix
        System.out.println("value of Y = "+y);
        
        y =x--; //postfix
        System.out.println("value of Y = "+y);
        
      
        
        y=x++; //postfix
        System.out.println("value of Y = "+y);  //here y=
        
        y=x;     //second x e value one plus hbee:)
        System.out.println("value of Y = "+y); //here y =
        
        y=++x;  //pre increment
        System.out.println("Value of Y = "+y); // y=
        
        y=x;
        System.out.println("Value of Y = "+y);  //y=
        
    }
    
}
