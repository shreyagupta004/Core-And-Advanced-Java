public class lec_51_accessModifier {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();

        employee e = new employee(18);
        System.out.println(e.getAge());

        teacher t = new teacher();
        t.show();

        Dog D = new Dog();
        D.bark();

        
     }
  
   
     public static class Student {

    public String name = "Riya";   // public ---

    public void display() {
        System.out.println(name);
    }
    }

    public static class employee {

    private int age;    // private----


    // to access private variable we have to make a getter and a setter----

    public void setAge(int age) {    // setter---
        this.age = age;
    }

    public int getAge() {         //getter---
        return age;
    }

    public employee(int age){
        this.age = age;
    }
 
}

public static class teacher {

    String name = "shreya";     //default----
    public void show(){
        System.out.println(name);
    }
 }
 static class Animal {

    protected void sound() {
        System.out.println("Animal makes sound");
    }
}



static class Dog extends Animal {

    void bark() {
        sound();
        System.out.println("Dog is barking");
    }
}
}
