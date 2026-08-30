import java.util.*;
public class lec_82_lambdaExpressionAndNestedLoops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the year : ");
        int n = sc.nextInt();

        New lp = (year) ->{
            if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)){
                return true;
            }
            else{
                return false;
            }
        };
        if(lp.test(n)){
            System.out.println("yes " + n + " is a leap year");
        }
        else{
            System.out.println(n + " is not a leap year");
        }

  
    }
    interface New{
        boolean test(int n);  
    }
    
}