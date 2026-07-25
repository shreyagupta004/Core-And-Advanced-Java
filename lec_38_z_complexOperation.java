import java.util.*;
public class lec_38_z_complexOperation {
    public static void main(String args[]){
        complexNumber c1 = new complexNumber(3,4);
        complexNumber c2 = new complexNumber(5,2);
        c1.add(c2);
        c1.subtract(c2);

    }
    public static class complexNumber{
        private int real;
        private int imaginary;
        public void setReal(int real){
            this.real = real;
        }
        public int getReal(){
            return real;
        }
         public void setImaginary(int imaginary){
            this.imaginary = imaginary;
        }
        public int getImaginary(){
            return imaginary;
        }

        public complexNumber(int real, int imaginary){
            this.real = real;
            this.imaginary = imaginary;

            
        }
        public void add(complexNumber c){
            int newReal = this.real + c.real;
            int newImaginary = this.imaginary + c.imaginary;

            System.out.println("Addition = " + newReal + " + " + newImaginary + "i");
        }

        public void subtract(complexNumber c) {
            int newReal = this.real - c.real;
            int newImaginary = this.imaginary - c.imaginary;

            System.out.println("Subtraction = " + newReal + " + " + newImaginary + "i");
        }
    }
}
