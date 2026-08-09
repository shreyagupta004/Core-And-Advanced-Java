public class lec_54_staticInitializer {
    public static void main(String[] args) {
         System.out.println("Main method  Called");
         StaticInt obj = new StaticInt();
           obj.myMethod1();
           obj.myMethod2();
}
        
    }
     class StaticInt {


    public static final String Name;




    static{
        Name = "Manish";
        System.out.println("First static Initialisation Done ");
    }


    public StaticInt(){
        System.out.println("Constructor Called");
    }


    static{
       
        System.out.println("Second static Initialisation Done ");
    }
    public void myMethod1(){
        System.out.println("myMethod1Called");
    }
   


    static{
       
        System.out.println("Third static Initialisation Done ");
    }


    public void myMethod2(){
        System.out.println("myMethod2Called");
    }
}

