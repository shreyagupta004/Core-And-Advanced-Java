import java.util.*;
public class lec_39_classVsObjectVsReferenceVsInstance {
    public static void main(String args[]){

        // object---
        student s1 = new student();
        s1.display();  //reference--
        

    }
    public static class student{      //class---
        String name;
        int age;
        
        void display(){      //method---
            System.out.println("shreya");
        }
    }
}
