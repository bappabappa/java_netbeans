
package string;

public class NumberConvert01 {
    public static void main(String[] args) {
        
        int decimal =15;
        String binary = Integer.toBinaryString(decimal);
        System.out.println(binary);
        
        int decimal2 =16;
        String octalObj =Integer.toOctalString(decimal);
        System.out.println(octalObj);
        
        int decimal3 =17;
        String hexaObj =Integer.toHexString(decimal);
        System.out.println(hexaObj);
    }
}
