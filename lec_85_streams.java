import java.util.*;
import java.util.stream.Collectors;

public class lec_85_streams {
    public static void main(String[] args) {
        List<Stream1> studentData = new ArrayList<>();
        studentData.add(new Stream1("A" , 1 , 90.2f) );
        studentData.add(new Stream1("B" , 2 , 80.2f) );
        studentData.add(new Stream1("C" , 3 , 70.2f) );
        studentData.add(new Stream1("D" , 4 , 20.2f) );
        studentData.add(new Stream1("E" , 5 , 60.2f) );

        List<Float> studentDataCopy =studentData.stream()
            .filter(p -> p.percent > 50)  //filtering data
            .map(p -> p.percent)    //fetching data
                .collect(Collectors.toList());  //collecting data to the list
            System.out.println(studentDataCopy);
        
    }
    public static class Stream1{
        String name;
        int id;
        Float percent;

        public Stream1(String name , int id , float percent){
            this.name = name;
            this.id = id;
            this.percent = percent;
        }
    }
}
