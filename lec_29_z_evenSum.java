import java.util.*;
public class lec_29_z_evenSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter start:");
        int start = sc.nextInt();
        System.out.println("enter end:");
        int end = sc.nextInt();
       sumEven(start , end);

    }
    public static boolean isEven(int number){
        if(number<=0){
            return false;
        }
        if(number % 2 == 0){
                return true;
        }else{
            return false;
            }
        }
    

    public static int sumEven(int start , int end){

        if(end<start){
            return -1;
        }

        if(end<=0 || start<=0){
            return -1;
        }
        int sum = 0;
        for(int i = start ; i <= end ; i++){
            if(isEven(i)){
                sum = sum + i;
            }
        }
        System.out.println(sum);
        return sum;
    }
}
