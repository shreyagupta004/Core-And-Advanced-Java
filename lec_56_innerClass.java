public class lec_56_innerClass {
    public static void main(String[] args) {
        outerClass obj = new outerClass(2,5,7,8);
        outerClass.innerClass obj2 = obj.new innerClass();
        obj2.display();
        
    }
    public static class outerClass{
         private int a;
         private int b;
         private int c ;
         private int d;

         public outerClass(int a, int b, int c, int d){
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;

            
         }
         public class innerClass{
            public void display(){
                System.out.println("the value of a :" + a);
                System.out.println("the value of b :" + b);
            }
         }
    }
}
