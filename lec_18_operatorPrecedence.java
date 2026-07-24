public class lec_18_operatorPrecedence {
    public static void main(String args[]){
         int length = 15;
        int breadth = 10;
        
        double perimeter = 2 * length + breadth; //this is wrong 
        
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        perimeter = 2 * (length + breadth);
        System.out.println("actual perimeter is: " + perimeter);
    }
}
