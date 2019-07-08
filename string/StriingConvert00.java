
package string;

public class StriingConvert00 {
    
    public static void main(String[] args) {
        
        int   i =100;
        String obj  = Integer.toString(i);
        System.out.println("convert int to string ="+obj);
        
        double  d =10.12;
        String s  = Double.toString(d);
        System.out.println("convert double to string ="+s);
        
        boolean b =true;
        String as =Boolean.toString(b);
        System.out.println("boolean to string ="+b);
    }
}
