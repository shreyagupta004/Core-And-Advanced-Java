public class lec_05_casting {
public static void main(String args[]){
    float num1=500;
    float num2=700;
    int sum=(int)(num1+num2);
    System.out.println(sum);
    int num=500;
    double num3=(double)num;
    System.out.println(num3);



    //question----
    byte value=10;
    int val=15;
    short valuee=5;
    long add=1000*(value+val+valuee);
    System.out.println(add);

    short sm=(short)(1000*(value+val+valuee));
    System.out.println(sm);


}
}
