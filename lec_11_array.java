import java.util.*;
public class lec_11_array {
    public static void main (String args[]){

        Scanner sc=new Scanner(System.in);
        //initialisation of array----     
        
        int arr[]={1,2,4,3,7};
         
       // arr[4]=44;
        System.out.println(arr[0]);
            
        int a[]=new int[10];
        
        

            //how to take input from user----

            int array[]=new int[10];
            for(int j=0;j<10;j++){
                array[j]=sc.nextInt();
            }
            int sum=0;
                for(int j=0;j<10;j++){
                    sum=sum+array[j];
                }
                    System.out.println(sum);
    }
}
