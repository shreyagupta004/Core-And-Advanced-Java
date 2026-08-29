import java.util.*;
public class lec_77_interruptAndJoin {
    public static void main(String[] args) {

        System.out.println("This is the main thread");


         Thread secThread = new SecondThread();
         secThread.setName(" ThreadSecond");
         secThread.start();


        Thread letsRun = new Thread(new myRunnable());
        letsRun.start();
        letsRun.interrupt();

         new Thread(){
            public void run(){
                System.out.println("New Thread");


                try{
                    secThread.join(5000);
                   }
                   catch(InterruptedException e)
                   {
                    System.out.println("interrupted");
                   }
            }
        }.start();
        
         System.out.println("New Main Thread");

        
    }
    public static class myRunnable implements Runnable{
        @Override
        public void run(){
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println("interrupted");
            }
            System.out.println("waited for 2 sec and resumed");
        }

    }
    public static  class SecondThread extends Thread {


    @Override
    public void run() {
       
        System.out.println("This is a sub thread" + currentThread().getName());


        try{
            Thread.sleep(5000);
        }
        catch(Exception e)
        {
            System.out.println("interrupted by another thread");
        }
        System.out.println("5 secs have passed");
    }
   
   
}


}
