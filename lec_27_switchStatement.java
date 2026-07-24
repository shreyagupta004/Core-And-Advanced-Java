import java.util.*;
public class lec_27_switchStatement {
    public static void main(String aegs[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the day:");
        String days=sc.nextLine();
        switch(days.toLowerCase()){    //.toLowerCase will make the input in lowercase
            case "sunday":
                System.out.println("today is sunday.");
                break;
            case "monday":
                System.out.println("today is monday.");
                break;
            default:
                System.out.println("invalid day.");
        }
        System.out.print("enter a:");
        int a=sc.nextInt();
        System.out.print("enter b:");
        int b=sc.nextInt();

        System.out.println("enter operator(+ , - , * , / ,%)");
        char operator=sc.next().charAt(0);

        switch(operator){
            case '+':
                System.out.print(a+b);
                break;
            case '-':
                System.out.print(a-b);
                break;
            case '*':     
                System.out.print(a*b);
                 break;
            case '/':
                System.out.print(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.print("invalid operator.");
        } 
         

        
        
    }
}
