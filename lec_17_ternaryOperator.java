public class lec_17_ternaryOperator {
    public static void main (String args[]){
        boolean isMarch = false;
        
        boolean isNoofDay31 = isMarch ? true : false;
        isMarch = true;
        
        if (!isNoofDay31) {
            System.out.println("Days are not 31");
        }
        
        int heightOfTruck = 50;
        
        boolean TruckAllowed = heightOfTruck == 50 ? true : false;
        
        if(TruckAllowed) {
            System.out.println("You can cross the bridge");
        }

        int a=10;
        int b=20;
        int sum=(a<b) ? a : b;
        System.out.println(sum);
    }
}
