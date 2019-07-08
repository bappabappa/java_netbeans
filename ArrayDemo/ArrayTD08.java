package arraydemo;

public class ArrayTD08 
{
    public static void main(String[] args) {
        int[][] number =new int[2][3];
        
        number[0][0] =10;
        number[0][1] =20;
        number[0][2] = 30;
        number[1][0] =40;
        number[1][1] =50;
        number[1][2] =60;         //T-D_A value print normal way
        
        System.out.println(number[0][0]);
        System.out.println(number[0][1]);
        System.out.println(number[0][2]);
        System.out.println(number[1][0]);
        System.out.println(number[1][1]);
        System.out.println(number[1][2]);
        
    }
    
}
