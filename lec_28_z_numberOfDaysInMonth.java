import java.util.*;
public class lec_28_z_numberOfDaysInMonth {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter month:");
        int month = sc.nextInt();
        System.out.println("enter year:");
        int year = sc.nextInt();
        if(month > 12 || month < 0){
            System.out.println("invalid ");
        }
        switch(month){
            case 1:
                System.out.println(month + " of "+ year + " has "+ " 31 days");
                break;
            case 2:
                if((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0){
                    System.out.println("february "+ year + " has 29 days" );
                }else{
                    System.out.println("february " + year + " has 28 days");
                }
                break;
            case 3:
                System.out.println(month + " of "+ year + " has "+ " 3i days");
                break;
            case 4:
                System.out.println(month + " of "+ year + " has "+ " 30 days");
                break;
            case 5:
                System.out.println(month + " of "+ year + " has "+ " 31 days");
                break;
            case 6:
                System.out.println(month + " of "+ year + " has "+ " 30 days");
                break;
            case 7:
                System.out.println(month + " of "+ year + " has "+ " 31 days");
                break;
            case 8:
                System.out.println(month + " of "+ year + " has "+ " 31 days");
                break;
            case 9:
                System.out.println(month + " of "+ year + " has "+ " 30 days");
                break;
            case 10:
                System.out.println(month + " of "+ year + " has "+ " 31 days");
                break;
            case 11:
                System.out.println(month + " of "+ year + " has "+ " 30 days");
                break;
            case 12:
                System.out.println(month + " of "+ year + " has "+ " 31 days");
                break; 
            default:
                System.out.println("unknown");   
        }

        
    }
}
