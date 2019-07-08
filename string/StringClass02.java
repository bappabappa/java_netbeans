
package string;

public class StringClass02
{
    public static void main(String[] args)
    {
      String s1 = "bappa";  // create string using string class 1st method
     String s2 = new String("Bappa");  //obbect  create kore string string class 2nd method
     
       System.out.println("s1 = "+s1);
       System.out.println("s2 = "+s2);
       
        int length = s1.length();
        System.out.println("length of s1 is : "+length);  // length method
        
         if (s1.equals(s2) )    // Equals method
        {
            System.out.println("equrals");   
        }
         else{
            System.out.println("not equqls");
           }
         
         if (s1.equalsIgnoreCase(s2) )    // EqualsIgonreCase method
        {
            System.out.println("equrals");   
        }
         else{
            System.out.println("not equqls");
          }
         
         boolean con =s1.contains("basp");  // contains method
         System.out.println(con);
     
         
         boolean b =s1.isEmpty();       // isEmpty method
         System.out.println("b= " +b);   // as s1 string empty na tai false return korbe
   
   }   
}
