public class lec_57_abstractClass {
    public static void main(String[] args){
       
        Elephant elephant = new Elephant("Tom");
        elephant.height();
        elephant.lifeSpan();


        Sparrow bird = new Sparrow("Rock");
        bird.height();
        bird.lifeSpan();
        bird.fly();
    }
}


    abstract class Animal {
    public String Name;
    public Animal(String name){
        Name = name;
    }
    public abstract void height();
    public abstract void lifeSpan();

    public String getName(){
        return Name;
    }
   
}


 class Elephant  extends Animal {


    public Elephant(String name){
        super(name);
    }


    @Override
    public void height() {
        
        System.out.println("The height of the Elephant is 5 metres");
       
    }


    @Override
    public void lifeSpan() {
        


        System.out.println("The lifespan of the Elephant is 70 years");
       
    } 
}


    abstract class Bird extends Animal{
    public Bird (String name){
        super(name);
    }


    @Override
    public void height() {

        System.out.println("Most birds have very less height");
       
    }


    @Override
    public void lifeSpan() {
        
        System.out.println("Birds have low life span");
       
    }
    public abstract void fly();
   
}


  class Sparrow extends Bird {
    public Sparrow(String name){
        super(name);
    }


    @Override
    public void fly() {
        
        System.out.println("Sparrow flies");
       
    }
   
   
}

