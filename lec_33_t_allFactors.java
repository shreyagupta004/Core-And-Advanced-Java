import java.util.*;
public class lec_33_t_allFactors {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int number = sc.nextInt();
        printFactor(number);

    }
    public static void printFactor(int number){
        if(number < 1){
            System.out.println("invalid number");
        }
        for(int i = 1 ; i <= number ; i ++){
           if(number % i == 0){
            System.out.print(i + ",");
           }
        }

    }
}
