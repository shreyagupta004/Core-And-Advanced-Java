import java.util.*;
public class lec_33_u_perfectNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int number = sc.nextInt();
        System.out.println(getPerfectNumber(number));

    }
    public static boolean getPerfectNumber(int number){
        int sum=0;
        if(number < 1){
            return false;
        }
        for(int i = 1;i<number;i++){
            if(number % i == 0){
                sum = sum + i;
            }
        }
        if(sum == number){
            return true;
        }else{
            return false;
        }
    }
}
