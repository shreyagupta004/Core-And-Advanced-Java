import java.util.*;
public class lec_28_switchChallenge {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the character:");
        char cha = sc.next().charAt(0);
        switch(Character.toUpperCase(cha)){
            case 'A':
                System.out.println("this is vowel");
                break;
            case 'E':
                System.out.println("this is vowel");
                break;
            case 'I':
                System.out.println("this is vowel");
                break;
            case 'O':
                System.out.println("this is vowel");
                break;
            case 'U':
                System.out.println("this is vowel");
                break;
            default:
                System.out.println("this is not vowel");
                break;
        }
    }
}
