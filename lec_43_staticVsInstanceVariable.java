import java.util.*;
public class lec_43_staticVsInstanceVariable {
    public static void main(String args[]){
        practice p =new practice("shreya");
        p.print();
        practice p2 = new practice("anshul");
        p2.print();
        p.print();         // beacuse of static it is printing anshul as static stores one exact location


    }
    public  static class practice{
        public static String name;
        public practice (String name){
            this.name = name;
        }
        public void print(){
            System.out.println("my name is " + name);
        }
    }
}
