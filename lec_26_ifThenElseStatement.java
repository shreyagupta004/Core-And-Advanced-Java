import java.util.*;
public class lec_26_ifThenElseStatement {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your marks:");
        int marks=sc.nextInt();
        if (marks==100){
            System.out.println("you scored S Grade.");
        }else if(marks >= 90 && marks <= 99){
            System.out.println("you scored A Grade.");
        }else if(marks >= 80 && marks <= 89){
            System.out.println("you scored B Grade.");
        }else if(marks >= 70 && marks <= 79){
            System.out.println("you scored C Grade.");
        }else{
            System.out.println("you are failed.");
        }
    }
}
