import java.util.*;
public class lec_71_exceptions {
    public static void main(String[] args) {

         System.out.println("the int value is : " +getInt());
        System.out.println(getIntLBYL());

        // int x = 10;
        // int y = 0;
        
        // try{
        //     int result  =x/y;
        //     System.out.println(result);
        // }
        // catch(Exception e){
        //     System.out.println("exception");
        // }
       

    }
    private static int getInt(){
         Scanner sc = new Scanner(System.in);

          return sc.nextInt();
    }

    private static int getIntLBYL(){
        Scanner sc = new Scanner(System.in);
        boolean valid = true;
        System.out.println("Please enter an int value");
        String input = sc.next();
        for(int i = 0 ; i < input.length() ; i++){
            if(!Character.isDigit(input.charAt(i))){
                valid = false;
                break;
            }
            
        }
        if(valid){
                return Integer.parseInt(input);
            }
            else{
                return 0;
            }
    }
}
