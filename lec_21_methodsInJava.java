import java.util.*;
public class lec_21_methodsInJava {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius:");
        double radius=sc.nextDouble();

        System.out.println("enter distance:");
        int distance=sc.nextInt();
        System.out.println("enter time:");
        int time=sc.nextInt();
        

       printMyInfo(); 



        areaOfCircle(radius);
        System.out.println("the radius is:"+areaOfCircle(radius));

        printSpeed(distance,time);
       // System.out.println(printSpeed(distance,time));

         

    }

    public static void printMyInfo(){
         String name="shreya gupta";
         int age=21;
         double height=5.4;
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }

    public static double areaOfCircle(double radius){
         radius=3.14*radius*radius;
        return radius;
    }


    public static void printSpeed(int distance,int time){
        int speed=distance/time;
        System.out.println("speed is :"+speed);

    }

}
