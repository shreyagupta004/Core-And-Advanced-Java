import java.util.*;
public class lec_81_lambdaExpression{
    public static void main(String[] args) {

        int width = 30;
        Drawable d2 = () -> {
            System.out.println("drawing " + width);
        };
        d2.draw();

        Sayable s = (name) ->{
            System.out.println(name);
        };
        s.say("shreya");

        addable add = (a , b ) -> (a + b);{
            System.out.println(add.add(10,20));
        }

        addable sub = (a , b) -> (a - b);{
            System.out.println(sub.add(20, 10));
        }
        
        addable mul = (a , b) -> (a * b);{
            System.out.println(mul.add(5,8));

        }

        
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("pqr");
        list.add("xyz");
        
        list.forEach(
            (n ) -> System.out.println(n)
        );

        
    
     
    }
    interface Drawable{
            public void draw();
         }
    
    interface Sayable{
        public void say(String name);
    }

    interface addable{
        public int add(int a , int b);
    }
}
