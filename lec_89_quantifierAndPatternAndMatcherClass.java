import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lec_89_quantifierAndPatternAndMatcherClass {
    public static void main(String[] args) {

        //Character classes----
        Pattern p = Pattern.compile("[0-9]");
        Pattern a = Pattern.compile("a+");
        
        //quantifiers----
        Matcher m = p.matcher("a34drfvr6r");
        Matcher n = a.matcher("aaadrfar6r");


        while(m.find()){
            System.out.println(m.start() + "----------" + m.group());
            
        }
         while(n.find()){
            System.out.println(n.start() + "----------" + n.group());
            
        }

    }
}
