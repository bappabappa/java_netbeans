
package string;

public class StringBuffer07 
{
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Anisul");
        
        System.out.println(sb);
        
        sb.append(" Islam ");   //append method jora lagay
        
        sb.append(25); // chaile iint value rakte paari
        
        System.out.println(sb);
        
        
        sb.reverse();    // reverse method
        System.out.println(sb);
        
        System.out.println();
        
        sb.delete(0, 5) ; // delet method, 0-5 porjonto sob delet korbe
        System.out.println(sb);
        
        
        sb.setLength(5);    // length method
        System.out.println(sb);
        
        
        
    }
    
}
