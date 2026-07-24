import java.util.*;
public class lec_11_y_arraySorting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int arraySize=sc.nextInt();
        int arr[]=new int[arraySize];
        System.out.println("enter elements of arrays:");
        for(int i=0;i<arraySize;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("the array is:");
        for(int i=0;i<arraySize;i++){
            System.out.println(arr[i]);
        }
    }
}
