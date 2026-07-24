import java.util.*;
public class lec_33_q_sharedDigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int a = sc.nextInt();
        System.out.println("enter second number:");
        int b =sc.nextInt();
        System.out.println(hasSharedDigit(a, b));

    }
    public static boolean hasSharedDigit(int a, int b){
        if((a <= 10 || a > 99) || (b <= 10 || b > 99)){
            return false;
        }
      
        int f1 = a / 10;
        int l1 = a % 10;
        int f2 = b / 10;
        int l2 = b % 10;
        if(f1 == f2 || f1 == l1 || l1 == f2 || l1 == l2 ){
            return true ;
        }else{
            return false;
        }
        
    }
}
