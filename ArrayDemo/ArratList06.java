
package arraydemo;

import java.util.ArrayList;

public class ArratList06 
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
       
         //number.clear();
        boolean check = number.isEmpty();
        System.out.println("arraylist empty : "+check);
         
        // contain method
      boolean exist=  number.contains(30);
        System.out.println("30 is in the list : "+exist);
        
        // index method
      int position =  number.indexOf(40);
        System.out.println("the index of 40 is : "+position);
        
        // set method  replace kore dibe vule ta
        number.set(3 , 50);
        System.out.println("After setting : "+number);
        
        
        //get method dara value get korte pari
        int x= number.get(0);
        System.out.println("index 0 = "+x);
        
        
        
        
    }
    
    
  
}
