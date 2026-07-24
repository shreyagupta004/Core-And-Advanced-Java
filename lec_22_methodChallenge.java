import java.util.*;
public class lec_22_methodChallenge {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter student name: ");
        String studentName=sc.nextLine();

        System.out.print("enter student marks: ");
         int studentMark=sc.nextInt();

        char Grade=calculateGrad(studentMark);
        printDetails(studentName,Grade);

    }
    public static char calculateGrad(int marks){
        char Grade;
        if(marks>90 && marks<=100){
            Grade='A';
        } else if(marks>80 && marks<=90){
            Grade='B';
        }else if(marks>60 && marks<=80){
            Grade='C';
        }else{
            Grade='F';
        }
        return Grade;
    }

    public static void printDetails(String studentName,char Grade){
        System.out.println("the student name is: "+studentName);
        System.out.println("she has scored: "+ Grade);
    }
}
