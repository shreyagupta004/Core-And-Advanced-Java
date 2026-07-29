public class lec_46_inheritance {
    public static void main(String[] args) {
        // Car car = new Car();
        // car.show();
        Automobile auto = new Automobile(50,1000000, "audi", "RX");
        Bike bike = new Bike(60, 2000, "ktm", "pro",
         50, 1309, 25);
         auto.movement();
        auto.speed(50);
        bike.movement();
        bike.speed(60);
        bike.display();

        
    }
    // public static class Vehicles{
    //     void show(){
    //         System.out.println("vehicle started");
    //     }

    // }
    // public static class Car extends Vehicles{
    //     @Override
    //     void show(){
    //         super.show();         // calling parent class----
    //         System.out.println("car stopped");
    //     }
    // }

    public static class Automobile{
        private double speed;
        private double cost;
        private String brand;
        private String model;
       public Automobile(double speed,double cost,String brand,String model){
        this.speed =speed;
        this.cost = cost;
        this.brand = brand;
        this.model = model;
       }
       public void movement(){
        System.out.println("Automobile is moving");
       }

       public void speed(int speed){
        System.out.println("automobile is moving with speed :" + speed);
       }
       public void display() {
       System.out.println("Brand : " + brand);
       System.out.println("Model : " + model);
       System.out.println("Cost : " + cost);
}

    }

    public static class Bike extends Automobile{
        private int batterySize;
        private int manufactureDate;
        private int mileage;
        public Bike(double speed,double cost,String brand,String model,
            int batterySize,int manufactureDate, int mileage){
                super(speed, cost, brand, model);
                this.batterySize= batterySize;
                this.manufactureDate = manufactureDate;
                this.mileage = mileage;
        }
        @Override
        public void movement(){
            System.out.println("bike drives");
        }
        public void speed(int speed){
            System.out.println("bike is moving with speed :" + speed);
        }  
        public void display(){
            super.display();
            System.out.println("Battery Size : " + batterySize);
            System.out.println("Manufacture Date : " + manufactureDate);
            System.out.println("Mileage : " + mileage);
        }

    } 
}
