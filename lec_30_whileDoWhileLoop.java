public class lec_30_whileDoWhileLoop {
    public static void main(String args[]){
        int j=0;
        for (int i = 1 ; i != 10 ; i++){
            System.out.println("the count is : " + i );
        }

        int count = 1;
        while(count != 10){
            System.out.println(count);
            count++;
        }

        while(true){
            if(j== 5){
                break;
            }
            System.out.println("count :" + j);
            j++;
        }

        do{
            System.out.println(j);
            j++;
        }while(j<10);
    }
}
