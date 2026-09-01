import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lec_91_AndOrNot {
    public static void main(String[] args) {
        String str = "shreya";
        System.out.println(str.replaceAll("shr[e|E]ya", "shriya"));

        String tvTest = "tstvtkt";
        String tNotV = "t(?!v)";
        Pattern p1 = Pattern.compile(tNotV);
        Matcher m1 = p1.matcher(tvTest);


        int count = 0;
        while(m1.find(count)){
            count++;
            System.out.println("Occurances " + count + " : " + m1.start()+" to "+m1.end());
        }
    }
}
