public class lec_45_encapsulationChallenge {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(4);
        c.display();

        
    }
    public static class Circle{
        private double radius;
        public  void setRadius(double radius){
            if(radius > 0){
            this.radius = radius;
            }else{
                System.out.println("radius should be greater than zero");
            }
        }
        public double getRadius(){
            return radius;
        }
        public double getArea(){
            return Math.PI * radius * radius;
        }
        public void display(){
            if (radius > 0) {
               System.out.println("the radius of circle is " + getRadius());
            System.out.println("the area of circle is " + getArea() );  
            }else{
                System.out.println("radius should be greater than zero");
            }
           
        }
    }
}
