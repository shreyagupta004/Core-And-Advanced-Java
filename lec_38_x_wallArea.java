import java.util.*;
public class lec_38_x_wallArea {
    public static void main(String args[]){
        wall w =new wall(5,4);
       System.out.println( w.getArea());

    }
    public static  class wall{
        private double height;
        private double width;

        public void setWidth(double width){
            if(width < 0){
                this.width = 0;
            }else{
                this.width = width;
            }
            
        }
        public Double getWidth(){
            return width;
        }
        public void setHeight(double height){
            if(height < 0){
                this.height = 0;
            }else{
                this.height = height;
            }
            
        }
        public double getHeight(){
            return height;
        }

        public wall(){

        }

        public wall(double width, double height){
            if(width < 0){
                this.width = 0;
            }else{
                this.width = width;
            }
            if(height < 0){
                this.height = 0;
            }else{
                this.height = height;
            }

        }

        public double getArea(){
            double area = width * height;
            return area;
        }
    }
}
