public class lec_24_y_playingCat {
    public static void main(String args[]){
       boolean res = isCatPlaying(true, 33);
       System.out.println(res);

    }
    public static boolean isCatPlaying(boolean summer,int temp){
        if(summer == true){
            if(temp >=25 && temp <= 45){
                return true;
            }else{
                return false;
            }
        }else{
            if( temp >=25 && temp <=35){
                return true;
            }else {
                return false;
            }
        }
       
    }
}
