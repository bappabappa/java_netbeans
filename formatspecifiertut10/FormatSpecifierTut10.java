package formatspecifiertut10;

public class FormatSpecifierTut10 {

        public static void main(String[] args)
        {
            boolean b =true;  //dynamic initialization
            char c ='a';
            short s =1212;
            int i =100;
            float f =10.2f;     //smsall leter f na likle errror asbe
            double d = 10.2;
            
            System.out.printf("boooean b = %b\n" ,b);
            System.out.printf(" character c =%c\n",c);
            System.out.printf("short =%s\n" ,s);
            System.out.printf("integer i =%d\n",i);
            System.out.printf("float f =%.2f\n",f);
            System.out.printf("double d =%.3f\n",d);
           
        
            
        }
    
}
