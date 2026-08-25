import java.util.Iterator;
import java.util.TreeSet;

public class lec_70_treeSet {
    public static void main(String[] args) {
       TreeSet<String> value = new TreeSet<>();
       value.add("shreya");
       value.add("riya");
       value.add("sam");
       value.add("sunny");
       value.add("samaira");

       Iterator it = value.iterator();
       while(it.hasNext()){
        System.out.println(it.next());
       }
       
    }
}
