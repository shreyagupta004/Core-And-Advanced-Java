import java.util.*;

public class lec_69_treeMap {
    public static void main(String[] args) {
        TreeMap<Integer , String> value = new TreeMap<>();
        value.put(5,"E");
        value.put(4,"D");
        value.put(6,"F");
        value.put(3,"C");
        value.put(1,"A");
        value.put(2,"B");
        
        Set set = value.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry m = (Map.Entry)it.next();
            System.out.println("key is " + m.getKey() + " and the value is " + m.getValue());
        }


    }
}
