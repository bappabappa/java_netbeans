
package string;

public class StringClass04
{
    public static void main(String[] args) 
    {
         String firstName ="Anisul";   
        String lastName =" Islam";    //space ta akakne dibo
     
        String fullName =  firstName.concat(lastName);  //  string  concat method
        System.out.println("Full name equal = "+fullName);
        
        String upperName =fullName.toUpperCase();    // using toUpper method
        System.out.println("upperneme = "+upperName);
        
        
        String lowerName =fullName.toLowerCase();    // using toLower method
        System.out.println("lowername = "+lowerName);
        
        boolean b =firstName.startsWith("A");  // startsWith method
        System.out.println("b= "+b);  
        
        boolean b1 =firstName.startsWith("a");  // startsWith method
        System.out.println("b= "+b1);
        
        boolean b2 =lastName.endsWith("m");   //endsWith method
        System.out.println("last name is = "+b2);
        
        boolean b3 =lastName.endsWith("h");   //endsWith method
        System.out.println("last name is = "+b3);
        
        
        String [] names ={"anis" ,"sobuj","niloy"};  // string type er array
        
        for (String x : names)
        {
            System.out.println(x);
        }
    }
   
}
