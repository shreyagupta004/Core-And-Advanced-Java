import java.util.regex.Pattern;
public class  lec_88_characterClassesAndBoundaryMatcher{
    public static void main(String[] args) {
        System.out.println(
       Pattern.matches("[Vv]aibhav","Caibhav"));


       System.out.println(
           Pattern.matches("[^pqr]", "a"));


           System.out.println(
               Pattern.matches("[^pqxr]", "0")
           );


           System.out.println(
               Pattern.matches("[a-dx-z]", "e")
           );


           System.out.println(
               Pattern.matches("//W","")
           );


           System.out.println(
               Pattern.matches("[a-z&&[^ad]]", "c")
           );


    }
}
