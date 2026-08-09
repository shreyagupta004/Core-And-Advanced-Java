public class lec_53_finalKeyword {
    public static void main(String args[]){
        final int x = 10; //can't update value--
        // x = 20; // Error

    }

    class Animal { 
        final void sound() {     //can't override---
            System.out.println("Animal sound"); } 
        }
    // class Cat extends Animal{
    //     void sound(){    // error

    //     }       
    // }

    final class Animals {
    }

    //  class Dog extends Animals {   //can't extend from final class---
 
    //  }   Error

}