package arraydemo;

public class ArrayDemo06     //strinns array using "for each loop"
{  
    public static void main(String[] args)
    {
      String[]names = {"bappa", "taohid" , "koushik","bappi :)" }; 
      
        System.out.println(names.length);  //arrray size ta print kre dekabe; []=4
       
        for (String x : names) {
            System.out.println(x);
            
        }
    }
    
}
