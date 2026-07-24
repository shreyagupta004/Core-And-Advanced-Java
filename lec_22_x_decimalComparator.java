import java.util.*;
public class lec_22_x_decimalComparator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first double decimal value:");
        double num1=sc.nextDouble();
        System.out.print("Enter the second double decimal value:");
        double num2=sc.nextDouble();
        System.out.print("Enter the third double decimal value:");
        double num3=sc.nextDouble();
        System.out.println(areEqualByFiveDecimalPlaces(num1,num2,num3));

    }
    public static boolean areEqualByFiveDecimalPlaces(double a,double b,double c){
        int n1 = (int) (a * 100000);
        int n2 = (int) (b * 100000);
        int n3 = (int) (c * 100000);
        if(n1 == n2 && n2 == n3){
            return true;
        }else{
            return false;
        }

    }
}
