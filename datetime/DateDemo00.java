
package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo00 {
    public static void main(String[] args) {
        
        Date date =new Date();
       // System.out.println(date);
       
       DateFormat dateFormate = new SimpleDateFormat("dd/MM/YYY");
        dateFormat.format(date);
    }
}
