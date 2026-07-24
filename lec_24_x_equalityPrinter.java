import java.util.*;
public class lec_24_x_equalityPrinter {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);

        System.out.print("enter first number:");
        int a=sc.nextInt();

        System.out.print("enter second number:");
        int b=sc.nextInt();

        System.out.print("enter third number:");
        int c=sc.nextInt();

        printEqual(a, b, c);
    }
    public static void printEqual(int a,int b,int c){
        if(a < 0 || b < 0 || c < 0){
            System.out.println("invalid");
        }else if(a == b && b== c && a==c){
            System.out.println("all numbers are equal.");
        }else if(a != b && b != c && a != c){
            System.out.println("all numbers are different");
        }else{
            System.out.println("neither all are equal or different");
        }

}
    
}
