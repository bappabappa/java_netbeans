
package string;

public class StringClass01
{
    public static void main(String bappa[])
    {
     String s1 = "bappa";  // create string using string class 1st method
     String s2 = new String("bappa");  //obbect  create kore string string class 2nd method
     
     char [] s3 ={'b','a','p','p', 'a'};
        System.out.println(s3);
     
     
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);
        System.out.println();
        
       int length = s1.length();
        System.out.println("length of s1 is : "+length);  // length method
        
        if (s1==s2)    // == method value compare korte pare na
        {
            System.out.println("equrals");   
        }
        else
            System.out.println("not equqls");
        
        
        if (s1.equals(s2) )    // Equals method value compare korar jonno
        {
            System.out.println("equrals");   
        }
        else
            System.out.println("not equqls");
        
        if (s1.contains(s2) )    // contains method
        {
            System.out.println("equrals");   
        }
        else
            System.out.println("not equqls");
        
    }
   
}
