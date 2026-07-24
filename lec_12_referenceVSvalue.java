import java.util.*;
public class lec_12_referenceVSvalue {
    public static void main(String args[]){
        //value type----
        int num1=10;
        int num2=num1;
        System.out.println("first number is:"+ num1);
        System.out.println("second number is:"+num2);

        num2=num2+1;
        System.out.println("new first number is:"+ num1);
        System.out.println("new second number is:"+num2);

        //reference type----

        int arr1[]=new int[5];
        int arr2[]=arr1;
        System.out.println("first array is:" + Arrays.toString(arr1));
        System.out.println("second array is:" + Arrays.toString(arr2));
         
         arr2[2]=5;

        System.out.println("new first array is:" + Arrays.toString(arr1));
        System.out.println("new second array is:" + Arrays.toString(arr2));


        int a[]={1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        

        modifyarray(arr2);
        System.out.println("modified first array is:" + Arrays.toString(arr1));
        System.out.println("modified second array is:" + Arrays.toString(arr2));

         arr2=new int[6];
        arr2[0]=11;

        System.out.println("latest first array is:" + Arrays.toString(arr1));
        System.out.println("latest second array is:" + Arrays.toString(arr2));

    }

    public static void modifyarray(int [] array){
        array[0]=10;


    }
}
