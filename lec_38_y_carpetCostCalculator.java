import java.util.*;
public class lec_38_y_carpetCostCalculator {
    public static void main(String args[]){
        floor f = new floor(7 , 6);
        carpet c = new carpet(8);
        calculator cal = new calculator(f,c);
        System.out.println(cal.getTotalCost());
        

    }
    public static class floor{
        private double width;
        private double lenght;

        public void setWidth(double width){
            if(width < 0){
                this.width = 0;
            }else{
                this.width = width;
            }
        }

        public double getWidth(){
            return width;
        }

        public void setLenght(double lenght){
            if(lenght < 0){
                this.lenght = 0;
            }else{
                this.lenght = lenght;
            }
        }

        public double getLenght(){
            return lenght;
        }

        public  floor(double width, double lenght ){
             if(width < 0){
                this.width = 0;
            }else{
                this.width = width;
            }
            if(lenght < 0){
                this.lenght = 0;
            }else{
                this.lenght = lenght;
            }

        }
        public double getArea(){
            return width * lenght;
        }
    }

    public static class carpet{
        private double cost;

        public void setCost(double cost){
            if(cost < 0){
                this.cost = 0;
            }else{
                this.cost = cost;
            }
        }
        public  double getCost(){
        return cost;
    }
            
        public carpet(double cost){
            if(cost < 0){
                this.cost = 0;
            }else{
                this.cost = cost;
            }
        }
        
        
    }
   

    public static class calculator{
        private floor Floor;
        private carpet Carpet;

        public calculator(floor Floor, carpet Carpet){
            this.Floor = Floor;
            this.Carpet = Carpet;
           
        

        }
        public double getTotalCost(){
            return Floor.getArea() * Carpet.getCost();
        }
    }
    
}
