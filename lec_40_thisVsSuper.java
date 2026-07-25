import java.util.*;
public class lec_40_thisVsSuper {
    public static void main(String args[]){
        Dog a = new Dog();
        a.print();

    }
    public static class Animal {
    String name = "Animal";
}

public static class Dog extends Animal {

    String name = "Dog";

    void print() {
        System.out.println(this.name);   //this--- current class
        System.out.println(super.name);  //super ---- parent class
    }
}
}
