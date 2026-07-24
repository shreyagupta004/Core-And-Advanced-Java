import java.util.*;
public class lec_33_s_greatestCommonDivisor {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter first number:");
    int first = sc.nextInt();
    System.out.print("enter second number:");
    int second = sc.nextInt();
    System.out.println(getGreatestCommonDivisor(first, second));
   } 
   public static int getGreatestCommonDivisor(int first , int second){
    int greatest =0;
    if(first < 10 || second < 10){
        return -1;
        

    }
    
    for(int i = 1; (i <= first && i <= second);i++){
        if((first % i == 0) && (second % i == 0)){
             greatest =i;
        }

    }
    return greatest;
   
   
}
}
