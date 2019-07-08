
package string;

public class StringClass05
{
    public static void main(String[] args) {
        
        String country ="Bangladesh is my country    ";
        System.out.println(country);
        
        
        String s3 =country.trim();  // space remove kore ai method 1st & last er
        System.out.println(s3);
        
        char ch = country.charAt(0);   //charAt method;
        System.out.println("ch "+ch);
        
        int value = country.codePointAt(0);  // codePoint 
        System.out.println("value "+value);
        
        int pos = country.indexOf("n");   //index of
        System.out.println("first position of n =" +pos);
        
        int pos1 = country.indexOf("is");
        System.out.println("first position of n =" +pos1);
        
        pos =country.lastIndexOf("n");
        System.out.println("lst position of n is ="+pos);
        
    }
   
}
