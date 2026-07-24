public class lec_03_primitiveDatatype {
    public static void main(String args[]){
    // int value=11111111111111;
    // System.out.println(value);
    int maxvalue=Integer.MAX_VALUE;
    int minRange=Integer.MIN_VALUE;
    System.out.println(maxvalue);
    System.out.println(minRange);

    int sum1=maxvalue+1;     //overflows
    int sum2=minRange-1;     //underflows
    System.out.println(sum1);
    System.out.println(sum2);
    }
}
