import java.util.*;
public class lec_22_y_equalProductChecker {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter first number: ");
        int num1=sc.nextInt();

         System.out.print("enter second number: ");
        int num2=sc.nextInt();

         System.out.print("enter third number: ");
        int num3=sc.nextInt();
        
       boolean result =  hasEqualProduct(num1, num2, num3);
       System.out.println(result);


    }
    public static boolean hasEqualProduct(int a,int b,int c){
        if(a * b ==c){
            return true;
        }else{
            return false;
        }
    }
}
