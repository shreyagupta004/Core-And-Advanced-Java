public class lec_52_staticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student(); 
        Student s2 = new Student(); 
        s1.name = "Riya"; 
        s2.name = "Rahul"; 
        s1.display(); 
        s2.display();
        Calculator.add();   

    }
    static class Student { 
        String name; 
        static String college = "ABC";   //static variable-----
          void display() {
             System.out.println(name + " " + college);
        }
    }
    class Calculator { 
        static void add() {    //static method----
             System.out.println(10 + 20); }
         }
}
