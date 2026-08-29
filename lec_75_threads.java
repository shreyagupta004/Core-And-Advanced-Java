public class lec_75_threads {
    public static void main(String[] args) {

        System.out.println("this is the main Thread");
        Thread secThread = new secondThread();
        secThread.setName("secThread");
        secThread.setPriority(10);
        secThread.start();
        System.out.println("new main thread");
        
    }
    public static class secondThread extends Thread{
        @Override
        public void run(){
            System.out.println("this is a sub thread " + currentThread().getName());

            try{
                Thread.sleep(5000);
            }
            catch(Exception e){
                System.out.println("interrupted by another thread");
            }
            System.out.println("5 sec has passed");
        }
    }
}
