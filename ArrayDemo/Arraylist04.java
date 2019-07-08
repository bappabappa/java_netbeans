
package arraydemo;

import java.util.ArrayList;

public class Arraylist04
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
       
        System.out.println("Arraylist contain : "+number);
        System.out.println();
         System.out.println("size = "+number.size());
       
         
         //removing elements
         number.remove(2);
         System.out.println("After removing contains : "+number);
      
         //removing all method
         number.removeAll(number);
         System.out.println("After removing all : "+number);
    }
   
}
