import java.util.*;

public class lec_68_linkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> value = new LinkedHashSet<>();
        value.add(10);
        value.add(20);
        value.add(30);
        value.add(40);
        value.add(50);
        value.add(10);
        System.out.println(value);
        Iterator it = value.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
