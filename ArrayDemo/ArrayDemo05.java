package arraydemo;

public class ArrayDemo05     //strinns array
{  
    public static void main(String[] args)
    {
      String[]names = {"bappa", "taohid" , "koushik","bappi :)" }; 
      
        System.out.println(names.length);  //arrray size ta print kre dekabe; []=4
       
        for (int i = 0; i < 4; i++) {  // traditional loop jekane bole dite hoi koto kore barbe
            System.out.println(names[i]);
            
        }
    }
    
}
