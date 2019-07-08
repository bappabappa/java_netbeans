package arraydemo;

import java.util.Scanner;

public class ArrayDemo01     //finding sum and average
{
    public static void main(String[] args) 
    {
        double sum =0;
        Scanner input = new Scanner(System.in);
        double[] number =new double[5];
        System.out.println("please enter 5 numbers : ");
        
        number[0]=input.nextDouble();
        number[1]=input.nextDouble();
        number[2]=input.nextDouble();
        number[3]=input.nextDouble();
        number[4]=input.nextDouble();
        
        sum = number[0]+  number[1]+  number[2]+  number[3]+  number[4];
        System.out.println("The sum is : "+sum);
        
        
        
        
        
        
        
        
        
    }
}
