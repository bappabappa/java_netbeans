package arraydemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList02  // 3rd printing process using itertor method
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
       
       Iterator itr = number.iterator();
       while(itr.hasNext())
       {
           System.out.print(" "+itr.next());
       }
       System.out.println("size = "+number.size());
       
       
       
    }
   
}
