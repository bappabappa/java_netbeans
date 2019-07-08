
package arraydemo;

import java.util.ArrayList;

public class ArrayList01
{
    public static void main(String[] args)
    {
     ArrayList<Integer> number =new ArrayList< Integer>();
       System.out.println("size = "+number.size());
       
       // adding arraylist elements
       number.add(10);
       number.add(20);
       number.add(30);
       number.add(3,40);
       
      //  System.out.println(number);  // normally print jemne kori
       
      for (int x :number)         // 2nd printing process
        {
            System.out.print(" "+x);   
        }
        System.out.println();
      System.out.println("size = "+number.size()); 
        
      
     
       
             
        
        
        
        
        
        
    }
    
}
