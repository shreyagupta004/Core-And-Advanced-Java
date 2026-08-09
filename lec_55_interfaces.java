public class lec_55_interfaces {
    public static void main(String[] args) {
        ICar mycar;      //interface instance---
        mycar  = new Audi();     //class instance----
        mycar.engineOnorOff();     //method calling---
        mycar.noOfWheels();
        mycar.seatQuality();

        mycar = new Mercedes();
        mycar.engineOnorOff();
        mycar.noOfWheels();
        mycar.seatQuality();

        
    }
    //interface----
    public interface ICar {
         public void noOfWheels();
         public void engineOnorOff();
         public void seatQuality();
         public void steeringWheel();
         public void fuelTankSize();
        
    }
    public static  class Audi implements ICar{

        private boolean engine = true;

        public void noOfWheels(){
            System.out.println("it has four wheels");

        }
        public void engineOnorOff(){
            if(engine == true){
                System.out.println("engine is on for audi");
            }else{
                System.out.println("engine is off for audi");
            }

        }
        public void seatQuality(){
            System.out.println("quality is good");

        }
        public void steeringWheel(){

        }
        public void fuelTankSize(){

        }
    }

    public static class Mercedes implements ICar{
        private boolean engine = false;

        public void noOfWheels(){
            System.out.println("it has four wheels");

        }
        public void engineOnorOff(){
            if(engine == true){
                System.out.println("engine is on for mercedes");
            }else{
                System.out.println("engine is off for mercedes");
            }

        }
        public void seatQuality(){
            System.out.println("quality is good");

        }
        public void steeringWheel(){

        }
        public void fuelTankSize(){

        }
    
    }
}
