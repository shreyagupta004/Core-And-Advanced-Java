import java.util.*;
public class lec_29_forStatement {
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number:");
    int num=sc.nextInt();

    for(int i=1 ; i <= 10 ; i++){
        printTable(i, num);
    }

    for(int i=10 ; i>=1 ; i--){
        printReverseTable(i, num);
    }

}
public static void printTable(int i,int num){
    
    System.out.println(num*i);
}

public static void printReverseTable(int i,int num){
    System.out.println(num*i);
}

}
