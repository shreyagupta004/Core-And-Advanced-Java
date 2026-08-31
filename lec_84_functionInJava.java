import java.util.function.*;
import java.util.*;
public class lec_84_functionInJava {
    public static void main(String[] args) {

        Function<Integer , Integer> f = i -> (i*i);

        System.out.println(f.apply(5));
        System.out.println(f.apply(10));

        Function<String , Integer> f2 = s -> s.length();
        System.out.println(f2.apply("my name is shreya"));

        Function<String , String> f3 = s -> s.toUpperCase();
        System.out.println(f3.apply("my name is shreya"));



        Student[] std = {
                new Student(100, "shreya"),
                new Student(90, "riya"),
                new Student(80, "shrey"),
                new Student(70, "shreyansh")


        };

        Function<Student , String> f5 = s -> {
            int marks = s.marks;
            String grade = " ";
            if(marks > 90){
                grade = "A";
            }
            else if(marks > 80){
                grade = "B";
            }
            else if(marks > 70){
                grade = "C";
            }
            else{
                grade = "D";
            }

            return grade;

        };
        for(Student s1 : std){
            System.out.println("name = " + s1.name);
            System.out.println("marks = " + s1.marks);
            System.out.println("grade = " + f5.apply(s1));
        }
    }

    public static class Student{
        int marks;
        String name;
        public Student(int marks , String name){
            this.marks = marks;
            this.name  = name;
        }
    }
}
