import java.util.*;
public class lec_22_w_pythagoreanTriplet {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);

        System.out.print("enter first number:");
        int num1=sc.nextInt();

        System.out.print("enter second number:");
        int num2=sc.nextInt();

        System.out.print("enter third number:");
        int num3=sc.nextInt();
        
        checkPythagoreanTriplet(num1, num2, num3);
        
    }
    public static void checkPythagoreanTriplet(int a,int b,int c){
    
        double num1=Math.pow(a,2);
        double num2=Math.pow(b,2);
        double num3=Math.pow(c,2);


        if((num1 + num2) == num3){
            System.out.println("the entered numbers are pythagorean triplet");
        }else{
            System.out.println("the entered numbers are not puthagorean triplet");
        }
        
    }
}
