import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class lec_87_regularExpression {
    public static void main(String[] args) {
       String email = "riya123@gmail.com";

        String regex = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }

    }
}
