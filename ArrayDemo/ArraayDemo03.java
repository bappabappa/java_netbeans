package arraydemo;

import java.util.Scanner;

public class ArraayDemo03   //maximum minimum
{ 
     public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        
        double[] number =new double[5];
        double sum =0;
        
        System.out.print("please enter 5 numbers : ");
                       
        for (int i = 0; i < number.length; i++)
          {
             number[i]=input.nextDouble();
            
          }
          
          for (int i = 0; i <number.length; i++)
          {
             sum =sum+number[i];
             
              
           }
        
        System.out.println("The avarage is : "+sum/number.length );  //avarage
        double avag =sum/number.length;
        
        System.out.println("The sum is : "+sum);
        System.out.println("Avarage is : "+avag);  //alternative way
        
        double max =number[0];       // index[0] k amra maximum dorci.
       double min = number[0];
        
        
        for (int i = 1; i < 5; i++) {
            
            if (max<number[i]) 
            {
               max =number[i];                 
            }
            
             if (min>number[i]) 
            {
              min =number[i];                 
            }
        }
        System.out.println("maximum = "+max);
        System.out.println("minimum = "+min);
       
        
        }  
   }
    

