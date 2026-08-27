import java.io.*;
import java.util.*;

public class lec_73_bufferedReader {
    public static void main(String[] args) throws IOException {
        FileReader bf = new FileReader("C:\\Users\\dell\\OneDrive\\Desktop\\java-github\\abcd");
        BufferedReader br = new BufferedReader(bf);


        //for reading string valur---
        // String line = br.readLine();
        // while(line != null){
        //     System.out.println(line);
        //     line = br.readLine();
        // }
        


        //for reading integer value -----
        String[] intStr = br.readLine().split(" ");
        int arr[] = new int[intStr.length];

        for(int i = 0 ; i < intStr.length ; i++){
            arr[i] = Integer.parseInt(intStr[i]);
        }
        int sum = arr[0] + arr[2];
        System.out.println(sum);

        br.close();
    }
}
