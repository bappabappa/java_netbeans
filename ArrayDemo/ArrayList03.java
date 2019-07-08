
package arraydemo;

import java.util.ArrayList;

public class ArrayList03   // 4th printing method
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
       
        for (int i : number)
        {
            System.out.print(i+ " ");
            
        }
        System.out.println();
         System.out.println("size = "+number.size());
       
      
    }
   
}
