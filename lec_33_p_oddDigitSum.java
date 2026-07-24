import java.util.*;
public class lec_33_p_oddDigitSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int number = sc.nextInt();
        System.out.println(getOddDigitSum(number));
      

    }
    public static int getOddDigitSum(int number){
        if(number < 0){
           return -1;
        }
        int rem ;
        int sum = 0;
        while(number != 0){
            rem = number % 10;
            if(rem % 2 != 0){
                sum = sum + rem;
            }
            number = number / 10;
        }
        return sum;

       
      

    }
}
