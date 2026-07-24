import java.util.*;
public class lec_20_z_userIntputChallenge {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("plz enter the number for which u want to print the table:");
        int n=sc.nextInt();

        printTable(n);//function call
    }
    //making a method for printing the number---
    public static void printTable(int n){
        for(int i=1;i<=10;i++){
            int table;
            table=i*n;
            System.out.println(i + "*" + n +"="+table);
        }
    }
}
