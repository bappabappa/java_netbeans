
package string;

public class WrapperClass00 {
    public static void main(String[] args) {
        
        // primitive to object
        int x =30;
        Integer y =Integer.valueOf(x);   //wrapper class
        System.out.println("y ="+30);
        
        Integer z = x ;  // Integer.valueOf(x)  autoboxing
        System.out.println("z ="+z);
        
        
        //object to primitive data type
        Double d =new Double(10.25);
        System.out.println("d = "+d);
        
        double e =d.doubleValue();
        System.out.println("e = "+e);
        
        double r =d;  //d.doublevalue
        System.out.println("r = "+r);
        
    }
}
