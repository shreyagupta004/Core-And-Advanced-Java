public class lec_72_multiCatchBlocksInExceptionHandling {
    public static void main(String[] args) {
        try{
            int a = 0;
            int b = 24 / a;
        }

         catch(ArithmeticException e){
            System.out.println("this is never reached");
        }
        
        catch(Exception e){
            System.out.println("generic exception catch");
        }

        //  catch(ArithmeticException e){
        //     System.out.println("this is never reached");
        // }
    }
}
