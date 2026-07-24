import java.util.*;
public class lec_24_methodOverloadingChallenge {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter lenght:");
        int lenght=sc.nextInt();
        System.out.println("enter breadth:");
        int breadth=sc.nextInt();
        System.out.println("enter height:");
        double height=sc.nextDouble();

        area(lenght);
        area(lenght,breadth);
        area(breadth,height);

    }

    public static void area(int lenght){
        double sq_area=lenght*lenght;
        System.out.println("the area of square is:" + sq_area);
    }

    public static void area(int lenght,int breadth){
        double rec_area=lenght * breadth;
        System.out.println("the area of rectangle is:" + rec_area);
    }

    public static void area(int breadth,double height){
       double tri_area= 0.5 *(breadth * height);
       System.out.println("the area of triangle is:" + tri_area);
    }
}
