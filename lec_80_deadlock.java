public class lec_80_deadlock {
    static Object l1 = new Object();
    static Object l2 = new Object();
    public static void main(String[] args) {
        new thread1().start();
        new thread2().start();
        
    }
    public static class thread1 extends Thread{
        @Override
        public void run(){
            synchronized(l1){
                System.out.println("Thread 1 has lock 1");
                try{
                    Thread.sleep(5000);
                }
                catch(Exception e ){
                    
                }
                System.out.println("Thread 1 waiting for lock 2");
                synchronized(l2){
                    System.out.println("Thread 1 has lock 1 and lock 2");

                }
                System.out.println("Thread 1 releases lock 2");
            }
            System.out.println("Thread 1 releases lock 1");
            System.out.println("exiting....");
        }
    }
    //it is causing deadlock situation----
     
    // public static class thread2 extends Thread{
    //     @Override
    //     public void run(){
    //         synchronized(l2){
    //             System.out.println("Thread 2 has lock 2");
    //             try{
    //                 Thread.sleep(1000);
    //             }
    //             catch(Exception e){

    //             }
    //             System.out.println("THread 2 waiting for lock 1");

    //             synchronized(l1){
    //                 System.out.println("Thread 2 has lock 1 and lock 2");
    //             }
    //             System.out.println("Thread 2 release lock 2");
    //         }
    //         System.out.println("Thread 2 release lock 1");
    //         System.out.println("exiting....");
    //     }

    // }

    public static class thread2 extends Thread{
        @Override
        public void run(){
            synchronized(l1){
                System.out.println("Thread 1 has lock 1");
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){

                }
                System.out.println("Thread 1 waiting for lock 2");

                synchronized(l2){
                    System.out.println("Thread 2 has lock 1 and lock 2");
                }
                System.out.println("Thread 2 release lock 2");
            }
            System.out.println("Thread 2 release lock 1");
            System.out.println("exiting....");
        }

    }
}
