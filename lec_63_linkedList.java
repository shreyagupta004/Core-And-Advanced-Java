import java.util.*;

public class lec_63_linkedList {
    public static void main(String[] args) {
         LinkedList<String> list = new LinkedList<>();
        //  list.add("apple");
        //  list.add("boy");
        //  list.add("cat");
        //  list.add("dog");
        //  list.add("elephant");
        // //  Collections.sort(list,Collections.reverseOrder());
        // //  System.out.println(list);
        // printList(list);
        // list.add(5,"fish");
        // printList(list);
        // list.remove(5);
        // printList(list);

       ascOrdes(list, "cat");
       ascOrdes(list, "fish");
       ascOrdes(list, "zebra");
       ascOrdes(list, "monkey");
       printList(list);
       ascOrdes(list, "cat");
       printList(list);
       ascOrdes(list, "apple");
       printList(list);


    }
    public static void printList(LinkedList<String> LinkedList){
        Iterator<String> it = LinkedList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(".................");
    }
    public static boolean ascOrdes(LinkedList<String> LinkedList , String newword){
        ListIterator<String> stringListIterator = LinkedList.listIterator();
        while(stringListIterator.hasNext()){
            int compare = stringListIterator.next().compareTo(newword);
            if(compare == 0){
            System.out.println("word already exist");
            return false;
            }
            else if(compare > 0){
                stringListIterator.previous();
                stringListIterator.add(newword);
                return true;
            }
            else if(compare < 0){
                
            }
        }
        stringListIterator.add(newword);
        return true;
        

    }
}
