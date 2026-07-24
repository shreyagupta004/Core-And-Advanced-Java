import java.util.*;
public class lec_33_x_sumOfLargestPrimeNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        sumOfLargestPrimeNo(18);

    }
    public static void sumOfLargestPrimeNo(int number){
        int count=0;
       for(int i=2;i< number;i++){
        if(number % i == 0){
            count++;
        }

        }
        if(count == 0){
            System.out.println("prime number");
        }else{
            System.out.println("not a prime number");
        }
    }
}
