package controlstatement;

import java.util.Scanner;

public class VowelConsonant1 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("enter any letter");
        ch =input.next().charAt(0);  //bappa 
        
        if (ch=='a') {
            System.out.println("Vowel");
            
        }
        else if(ch=='e'){
            System.out.println("Vowel");
        }
         else if(ch=='i'){
            System.out.println("Vowel");
        }
         else if(ch=='o'){
            System.out.println("Vowel");
        }
        else if(ch=='u'){
            System.out.println("Vowel");
        }
        else
            System.out.println("Consonant");
        
    }
    
}
