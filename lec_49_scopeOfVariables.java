public class lec_49_scopeOfVariables {
    public static void main(String[] args) {
        demo d = new demo();
        d.display();

        student s = new student();
        s.show();

        System.out.println(college.college);   //can be accessed without creating object

    }
    public static class demo{

        public void display(){
            int age = 20;     //local variable---
            System.out.println(age);
        }
    }


    public static class student{
       String name = "shreya";      //instance variable----
       int age = 22;                //instance variable----
       public void show(){
        System.out.println(name);
        System.out.println(age);
       }
    }

    public static class college{
        static String college = "ABC college";    // static variable ---

    }
}
