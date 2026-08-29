import java.util.*;
public class  lec_76_runnableThreads{
    public static void main(String[] args) {
        //Thread letsRun = new Thread(new myRunnable());
        myRunnable r1 = new myRunnable();
        Thread letsRun = new Thread(r1);
        letsRun.start();
        
    }
    public static class myRunnable implements Runnable{
        @Override
        public void run(){
            System.out.println("this is runnable interface");
        }
    }
}