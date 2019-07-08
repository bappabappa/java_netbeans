package arraydemo;

public class ArrayDemo00 
{

    public static void main(String[] args)
    {
   
        int[] number = new int[5]; // decler and creation dynamically
                
        
        number[0]=10;
        number[1]=210;
        number[3]=130;
        number[4]=150;
        
        
        int sum = number[0]+number[1]+number[2]+number[3]+number[4];
        System.out.println("sum = "+sum);
        
        
        int index = number.length;      //length use korle array property dekabe
        System.out.println(index);
        System.out.println("Array size = "+index);
        
        System.out.println(number[0]);  //printing array
        

    }
    
}
