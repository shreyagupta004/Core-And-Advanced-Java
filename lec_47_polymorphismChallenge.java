public class lec_47_polymorphismChallenge {
    public static void main(String[] args) {
        Animal a = new Dog();
         Animal b = new Cat();
        a.sound();
        b.sound();
        a.eat();
        b.eat();
        
    }

    public static class Animal{
        public void sound(){
            System.out.println("Animal sound");
        }
        public void eat(){
            System.out.println("Animal eats");
        }
    }

    public static class Dog extends Animal{
       public void sound(){
        super.eat();
            System.out.println("bark");
        }
    }
    public static class Cat extends Animal{
        public void sound(){
            System.out.println("meow");
        }
    }
}
