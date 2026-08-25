import java.util.*;

public class lec_67linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer , String> value = new LinkedHashMap<>();
            value.put(1,"A");
            value.put(2,"B");
            value.put(3,"C");
            value.put(4,"D");
            value.put(5,"E");
            System.out.println(value);
            
            Set set = value.entrySet();
            
            Iterator it = set.iterator();
            while(it.hasNext()){
                Map.Entry me = (Map.Entry)it.next();
                System.out.println("key is " + me.getKey() + " the value is " + me.getValue());
            }

    }
}
