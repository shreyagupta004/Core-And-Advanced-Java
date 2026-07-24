import java.util.*;
public class lec_24_v_areaCalculator {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("enter radius:");
        double radius=sc.nextDouble();

        System.out.print("enter x(lenght) :");
        double x=sc.nextDouble();

         System.out.print("enter y(breadth) :");
        double y=sc.nextDouble();

        area(radius);

        area(x,y);
    }

    public static double area(double radius){
        if(radius < 0){
            return -1.0;
        }
        double areaOfCircle = 3.14 * radius * radius;
        System.out.println("the area of circle is :" + areaOfCircle);
        return areaOfCircle;
    }

    public static double area(double x,double y){
        if(x < 0 || y < 0){
            return -1.0;
        }
        double areaOfRect = x * y;
        System.out.println("the area of rectangle is :" + areaOfRect);
        return areaOfRect;
    }
}
