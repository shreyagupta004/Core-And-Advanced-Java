import java.util.*;
 class lec_22_u_megaByteConvertor {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the value in kilobyte:");
        int kiloBytes=sc.nextInt();
        
        printMegaByte(kiloBytes);
    }

    public static void printMegaByte(int kilobyte){
        int megaByte,kiloremainder;
        megaByte=kilobyte/1024;
        kiloremainder=kilobyte%1024;
        System.out.println(kilobyte + " KB "  + "=" + megaByte+" MB " + kiloremainder+" KB ");
    }
}
