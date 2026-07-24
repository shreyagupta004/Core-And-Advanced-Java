public class lec_10_string {
    public static void main(String args[]){

        //string is immutable

        String myname="shreya";
        System.out.println(myname); 
        String surname="gupta";
        String info=myname+surname;
        System.out.println(info);

        int myint=100;
        info=surname+myint;
        System.out.println(info);

        myname=surname+myname;
        System.out.println(myname);
    }
}
