public class lec_24_w_minutesToYearAndDaysCalculator {
    public static void main(String args[]){
        printYearsAndDays(561600);

    }
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("invalid value");
        }else{
        long years = minutes / 525600;
        long minuteRemaining = minutes - (years * 525600);
        long daysRemaining= minuteRemaining /1440;
        System.out.println(minutes + " min = " + years + " Y " + daysRemaining + " D ");
        }
    }

}
