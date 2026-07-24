import java.util.*;
public class lec_33_n_palindromeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter thr number to be checked:");
        int number =sc.nextInt();
        isPalindrome(number);


    }
    public static void isPalindrome(int number){
        int rem ,rev=0 ;
        int originalNum=number;
        while(number != 0){
            rem = number % 10 ;
            rev = (rev*10) + rem;
            number = number/10;
        }
        if(originalNum == rev){
            System.out.println("the given number is palindrome");
        }else{
            System.out.println("not a palindrome number");
        }

    }
}
