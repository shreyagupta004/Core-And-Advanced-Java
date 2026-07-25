import java.util.*;
public class lec_41_methodOverloadingVsOverriding {
    public static void main(String args[]){
        calculator cal = new calculator();
        cal.add(2,5);
        cal.add();
        cal.add(5.5,6.8);
       
        dog d = new dog();
        d.bark();
        

    }
    public static class calculator{
        int a;
        int b;
        void add(int a, int b){
            System.out.println(a+b);
        }
        //method overloading----
        void add(){
            System.out.println("nothing");
        }
        //method overloading----
        void add(double a, double b){
            System.out.println(a+b);
        }
    }

    public static class Animal{
       
        void bark(){
            System.out.println("animal is barking");
        }

    }
    public static class dog extends Animal{
        // overriding----
        @Override
        void bark(){
            System.out.println("dog is barking");
        }
    } 
}
