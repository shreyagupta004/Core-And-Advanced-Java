import java.util.*;
public class lec_22_v_barkingDog {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean barking = sc.nextBoolean();
        int time = sc.nextInt();
        System.out.println(shouldWakeUp(barking , time));

    }

    public static boolean shouldWakeUp(boolean barking,int hour){

        if (hour < 0 || hour > 23){
            return false;
        }
        if(barking == true && ( hour < 8 || hour > 22)){
            return true;
        }

        return false;
        
    }
}
