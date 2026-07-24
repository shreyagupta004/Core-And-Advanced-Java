import java.util.*;
public class lec_22_t_weightConverter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the weight in kgs:");
        double weight = sc.nextDouble();

        weightConverter(weight);
    }

    public static void weightConverter(double kilogram){
        double gram,milligram ;
        gram=kilogram*1000;
        milligram=kilogram*100000;
        System.out.println("weight in gram :" + gram);
        System.out.println("weight in milligram :" + milligram);



    }
}
