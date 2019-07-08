
package arraydemo;

import java.util.ArrayList;

public class ArrayList05
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
       
         number.clear();    //clear method
         System.out.println("after clear arraylist : "+number);
         
         
         
    }
  
}
