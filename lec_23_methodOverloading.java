public class lec_23_methodOverloading {
    public static void main(String args[]){
        String name = "shreya";
        int age = 21;
        double height = 5.4;
        printInfo(name, age, height);

        printInfo(name, age);

        printInfo(name);

        printInfo();


    }
    public static void printInfo(String name,int age,double height){
        System.out.println("my name is :" + name );
        System.out.println("my age is :" + age );
        System.out.println("my height is :" + height );
    }

    //method overloading-----

    public static void printInfo(String name,int age){
        System.out.println("my name is :" + name );
        System.out.println("my age is :" + age );
    }
    //method overloading----

    public static void printInfo(String name){
        System.out.println("my name is :" + name );
    }

    public static void printInfo(){
        System.out.println("method with no parameter.");
        
}
}
