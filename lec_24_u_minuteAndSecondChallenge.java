public class lec_24_u_minuteAndSecondChallenge {
    public static void main(String args[]){

       String res1=getDurationString(105,40);
       System.out.println(res1);
       String res2 = getDurationString(3945);
       System.out.println(res2);
        
    }

    public static String getDurationString(long minute,long second){
        if(minute < 0 || second < 0 || second >= 59){
            return "invalid string";
        }
        long hour = minute /60;
        long remainingMinutes=minute% 60;
        return hour + "h " + remainingMinutes  + "m " + second +"s " ;
    }

    public static String getDurationString(long second){
        if(second<0){
            return "invalid string";
        }
        long minute=second/60;
        long remainingSecond=second%60;
        return minute + "m " + remainingSecond + "s";
    }
}
