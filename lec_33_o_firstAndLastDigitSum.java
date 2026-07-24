import java.util.*;
public class lec_33_o_firstAndLastDigitSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int number = sc.nextInt();
        digitSum(number);


    }
    public static void digitSum(int number){
        if(number < 0){
            System.out.println("-1");
        }
       int first , last ;
        last = number % 10;
        while(number >= 10){
            number = number / 10;
        }
        first = number;
        System.out.println(first + last);

        }
        
    }

