public class lec_31_whileDoWhilePart2 {
    public static void main(String args[]){
      printOddNumbers(5);
    }

    public static void  printOddNumbers(int n ){
        int i=5;
        while(i<=30){
            if(i % 2 != 0){
                System.out.println("the odd numbers are :" + i);
            }
            i++;
        }
    }
}
