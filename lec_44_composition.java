import java.util.*;
public  class lec_44_composition{
    public static void main(String args[]){
        car c = new car();
        c.drive();

       

    }
    public static  class engine{
        void start(){
            System.out.println("engine started");
        }
    } 
    public static class car{
        engine n = new engine();
        
        void drive(){
            n.start();     //composition----
            System.out.println("car is moving");
        }
    }

    
}