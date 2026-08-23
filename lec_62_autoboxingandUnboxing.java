import java.util.ArrayList;

public class lec_62_autoboxingandUnboxing {

    class IntegerClass{
    private int myIntValue;  


    public IntegerClass(int myIntValue) {
        this.myIntValue = myIntValue;
    }

    public int getMyIntValue() {
    return myIntValue;
}




public void setMyIntValue(int myIntValue) {
    this.myIntValue = myIntValue;
}
}

    public static void main(String[] args) {
       // String[] stringArray = new String[10];
       // int[] intArray = new int[10];


      //  ArrayList stringArrayList = new ArrayList<>();
        //ArrayList intArrayLst = new ArrayList();
       //      ArrayList intArrayList = new ArrayList();


         //    intArrayList.add(new IntegerClass(15));


          //   int mynewINT = 12;
          Integer myInt = 10;
           Integer myNewInt = 19;


          ArrayList myIntArrayList = new ArrayList();
          for(int i =0;i<=10;i++)
          {
            myIntArrayList.add(i);
          }
          for(int i =0;i<=10;i++)
          {
           System.out.println(i+" is " + myIntArrayList.get(i));
          }


          ArrayList myDoubleList = new ArrayList();


          for(double db = 0.0;db<=10.0;db+=0.5){
            myDoubleList.add(db);
          }


          for(int i=0 ;i<myDoubleList.size();i++){
            System.out.println(myDoubleList.get(i));
          }
  }
    }

