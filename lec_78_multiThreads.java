public class lec_78_multiThreads {
    public static void main(String[] args) {
        add a = new add();
        addCount t1 = new addCount(a);
        t1.setName("Thread 1");
        addCount t2 = new addCount(a);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
        
    }

    public static class add{
        int i ;
        public void docountDown(){
            String color;

            switch(Thread.currentThread().getName()){
                case "Thread 1" :
                    color = threadColor.red;
                    break;
                case "Thread 2":
                    color = threadColor.blue;
                    break;
                default :
                    color = threadColor.yellow;

            }
            int n = 0;
            for(i = 0 ; i < 10 ; i++){
                n = n + 1;
                System.out.println(color + Thread.currentThread().getName() + ": n = " + n);
            }

        }
    }

    public static class addCount extends Thread{
        private add threadCount;
        addCount(add threadCount){
            this.threadCount = threadCount;
        }
        public void run(){
            threadCount.docountDown();
        }
        
    }
    public static  class threadColor{
        public static final String reset = "\u001B[0m";
        public static final String black = "\u001B[30m";
        public static final String red = "\u001B[31m";
        public static final String green = "\u001B[32m";
        public static final String yellow = "\u001B[33m";
        public static final String blue = "\u001B[34m";
        public static final String purple = "\u001B[35m";
        public static final String cyan = "\u001B[36m";
        public static final String white = "\u001B[37m";

    }
}
