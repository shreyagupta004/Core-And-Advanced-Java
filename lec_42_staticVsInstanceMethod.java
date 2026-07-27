import java.util.*;
public class lec_42_staticVsInstanceMethod {
    public static void main(String args[]){
        student.print();   // static can be accessed without making an object----
        student s1 = new student();
        s1.display();     // non-static need to make object to get accesed----
    }
    public static class student{
        public static void print(){
            System.out.println("this is static");
        }
        public void display(){
            System.out.println("this is non static");
        }
    }
}
