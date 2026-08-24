import java.util.*;
public class lec_65_hashSet {
    public static void main(String[] args) {
        HashSet<String> value = new HashSet<>();
        value.add("I");
        value.add("am");
        value.add("studying");
        value.add("JAVA");
        System.out.println(value);

        value.add("am");
        System.out.println(value);

        value.add("AM");
        System.err.println(value);

        value.remove("AM");
        System.out.println(value);
        
        System.out.println(value.contains("JAVA"));

        Iterator<String> it = value.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        
        Set<Integer> myvalue1 = new HashSet<>();
        myvalue1.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));
        System.out.println(myvalue1);

        Set<Integer> myvalue2 = new HashSet<>();
        myvalue2.addAll(Arrays.asList(new Integer[]{2,3,5,1,7,9}));
        System.out.println(myvalue2);
           
        //intersection b/w two sets---
        Set<Integer> intersection = new HashSet<>(myvalue1);
        intersection.retainAll(myvalue2);
        System.out.println(intersection);

        //union b/w two sets----
        Set<Integer> union = new HashSet<>(myvalue1);
        union.addAll(myvalue2);
        System.out.println(union);

        //difference b/w two sets----
        Set<Integer> difference = new HashSet<>(myvalue1);
        difference.removeAll(myvalue2);
        System.out.println(difference);

         Set<Integer> difference2 = new HashSet<>(myvalue2);
        difference.removeAll(myvalue1);
        System.out.println(difference2);




    }
}
