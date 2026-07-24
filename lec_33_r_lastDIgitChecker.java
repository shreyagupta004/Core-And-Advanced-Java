import java.util.*;
public class lec_33_r_lastDIgitChecker {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number:");
        int a=sc.nextInt();
        System.out.print("enter second number:");
        int b=sc.nextInt();
        System.out.print("enter thord number:");
        int c=sc.nextInt();
        hasSameLastDigit(a, b, c);


    }
    public static void hasSameLastDigit(int a, int b ,int c){
        if((a >= 10 && a <= 9999) && (b >= 10 && b <= 9999) && (c >= 10 && c <= 9999)){
            System.out.println("false");
        }
        int lasta = a % 10;
        int lastb = b % 10;
        int lastc = c % 10;
        if(lasta == lastb || lasta == lastc || lastb == lastc){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}
