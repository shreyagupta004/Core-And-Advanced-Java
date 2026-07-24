import java.util.*;
public class lec_22_z_teenNumberChecker {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter first number:");
        int num1=sc.nextInt();
        System.out.print("enter second number:");
        int num2=sc.nextInt();
        System.out.print("enter third number:");
        int num3=sc.nextInt();
        boolean result=hasNotTeen(num1, num2, num3);
        System.out.println(result);

    }
    public static boolean hasNotTeen(int a,int b,int c){

        if(a >= 13 && a <= 19){
            return false;
        }else if(b >= 13 && b <= 19){
            return false;
        }else if(c >=13 && c <= 19){
            return false;
        }else{
            return true;
        }
    }
}
