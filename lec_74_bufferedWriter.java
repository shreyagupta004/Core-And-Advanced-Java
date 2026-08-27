import java.io.*;
public class lec_74_bufferedWriter {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("newFile.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(100);
        bw.newLine();
        bw.write("my name is shreya gupta.");
        bw.newLine();
        String s = "my name is shreya gupta.";
        bw.write(s,3,7);
        bw.newLine();
        bw.write(s, 11, 6);
        bw.flush();
    }
}
