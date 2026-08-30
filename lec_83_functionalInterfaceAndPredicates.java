import java.util.function.Predicate;

public class lec_83_functionalInterfaceAndPredicates {
    public static void main(String[] args) {
         Predicate<Integer> greater_than = x -> (x > 10);
       // calling test method of the predicate
       System.out.println(greater_than.test(9)); //test method
       Predicate pred = Predicate.isEqual("Prepinsta"); //is equal method
       System.out.println(pred.test("prepinsta"));


    //   Predicate<Integer> grt_10 = x ->(x > 10);
    //   Predicate less_100 = x ->(x < 100);
    //   // composing two predicates using and
    //   System.out.println(grt_10.and(less_100).test(160)); //and (Predicate P) method


      // Predicate<Integer> eq_10 = x -> (x==10);
     //  Predicate grt_20 = x -> (x > 20);
       // composing two predicates using or
     //  System.out.println(eq_10.or(grt_20).test(21));


    // Predicate<Integer> greater_than = x ->(x>10);
     // calling negate method of the predicate
  //   System.out.println(greater_than.negate().test( 9));

    }
}
