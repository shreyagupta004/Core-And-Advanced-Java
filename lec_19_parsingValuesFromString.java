public class lec_19_parsingValuesFromString {
    public static void main(String args[]){

        String myValue = "1000";
        System.out.println(myValue);
        myValue+=1;
        System.out.println(myValue);

        //parsing STRING into INT----

        int myIntValue=Integer.parseInt(myValue);

        myIntValue+=1;
        System.out.println("after parsing : " + myIntValue);

       

        String value = "2500.1";
        System.out.println(value);
        value+=500;
        System.out.println(value);

         //parsing STRING into DOUBLE----

        double myDoubleValue=Double.parseDouble(value);
        System.out.println(myDoubleValue);
        myDoubleValue+=500;
        System.out.println("after parsing:"+myDoubleValue);

    }
}
