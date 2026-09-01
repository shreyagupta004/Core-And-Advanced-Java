import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lec_90_matcherFind {
    public static void main(String[] args) {
        String str = "This is shreya gupta";
    String patternStr = ".*gupta.*";
    Pattern pt = Pattern.compile(patternStr, Pattern.CASE_INSENSITIVE);
    Matcher match = pt.matcher(str);
    boolean isMatch = match.matches();
    System.out.println(isMatch);
    }
}
