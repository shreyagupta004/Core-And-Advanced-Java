import java.util.*;
public class lec_34_classes1 {
public static void main(String args[]){
    Mobile sc = new Mobile();
    sc.model = "17 pro";
    sc.name = "apple";
    sc.ram = 5;
    System.out.println(sc.model);
    System.out.println(sc.name);
    System.out.println(sc.ram);


}

}
class Mobile{
      String model;
    String name;
    int ram;

}
