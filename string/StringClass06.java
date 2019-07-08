
package string;

public class StringClass06 {
    
    public static void main(String[] args) {
        
        String s1 ="This is my country";
        System.out.println(s1);
        
        
        String s2 =s1.replace('i','j');  //replace method
        System.out.println(s2);
        
      String[] s3 =  s1.split(" ");   // split method
        for (String x : s3)           //ja string er jekhane space pabe venge dibe
        {
            System.out.println(x);
        }
    }
}
