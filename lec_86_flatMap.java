import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lec_86_flatMap {
    public static void main(String[] args) {
        
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);
        List<List<Integer>> listofLists = Arrays.asList(list1, list3, list2);


        List<Integer> listofAllIntegers = listofLists.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(listofAllIntegers);

    }
}
