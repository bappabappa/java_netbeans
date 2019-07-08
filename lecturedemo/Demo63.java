
package lecturedemo;


class Test implements Runnable
{
  public void run()
  {
      for (int i = 1; i <= 5; i++)
      {
          System.out.println("test thread");   
      }
  
  }
}


public class Demo63 {
    public static void main(String[] args) {
        Test t =new Test();
        Thread obj =new Thread(t);
        obj.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main method");
        }
    }
    
}
