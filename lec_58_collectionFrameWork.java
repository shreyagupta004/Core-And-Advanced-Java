import java.util.*;
public class lec_58_collectionFrameWork {
    public static void main(String args[]){

        List<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(4);
        list.add(6);
        list.add(9);
        list.add(10);

        list2.add("shreya");
        list2.add("anshul");
        list2.add("riya");
        list2.add("billu");

        sublist.add(4);
         sublist.add(6);
        sublist.add(9);
        sublist.add(10);

        int index = Collections.indexOfSubList(list,sublist);
        System.out.println("the index is: " +index);
        

        // list.remove(0);
        // list.set(0, 8);

        //sorting---
        // Collections.sort(list);
       // Collections.sort(list2,Collections.reverseOrder());

       // System.out.println( list.get(5));

        ArrayList<String> list3 = new ArrayList<>();
       list3 = (ArrayList)list2.clone();
        Iterator IT = list.listIterator();


        while(IT.hasNext()){
            System.out.println(IT.next());
        }
         Iterator IT2 = list3.listIterator();
        while(IT2.hasNext()){
            System.out.println(IT2.next());
        }

        int search = Collections.binarySearch(list,1 );
        System.out.println(search);


        int max = Collections.max(list);
        System.out.println("the max value is : " +max);

        int min = Collections.min(list);
        System.out.println("the minimum value is : "+ min);

        Iterator IT3 = list2.listIterator();
        while(IT3.hasNext()){
            System.out.println(IT3.next());
        }
    }
}
