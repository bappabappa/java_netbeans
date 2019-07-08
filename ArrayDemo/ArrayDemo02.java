package arraydemo;

import java.util.Scanner;

public class ArrayDemo02     //finding sum and average using loop
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        
        double[] number =new double[5];
        double sum =0;
        
        System.out.print("please enter 5 numbers : ");
                       
        for (int i = 0; i < 5; i++)
          {
             number[i]=input.nextDouble();
            
          }
          
         //number[0]=1
         //number[1]=2
         //number[2]=3
         //number[3]=4
         //number[4]=5
          
          for (int i = 0; i < 5; i++)
          {
             sum =sum+number[i];
             
              
           }
        
        System.out.println("The sum is : "+sum);
        System.out.println("The avarage is : "+sum/5 );  //avarage
        
        double avag =sum/5;
        System.out.println("Avarage is : "+avag);  //alternative way
        
        }
}

