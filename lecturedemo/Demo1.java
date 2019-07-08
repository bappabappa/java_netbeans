
package lecturedemo;

 class A extends Thread 
{

 public void run()
 {
     for (int i = 1; i <= 5; i++) 
     {
         System.out.println("from thread A " +i);   
     }
     System.out.println("exit from A");
 }
}

class B extends Thread
{
   
    public void run()
  {
    for (int i = 0; i < 10; i++)
    {
        System.out.println("from thread B "+i);   
    }
      System.out.println("exit from B");
  } 
}

class Test
{
    public static void main(String[] args) {
        
        A obja = new A();
        B objb = new B();
        
        obja.start();
        objb.start();
    }


}



