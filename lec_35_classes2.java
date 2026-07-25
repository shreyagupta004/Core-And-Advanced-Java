public class lec_35_classes2 {
    public static void main(String args[]){
        mobile apple = new mobile();
        apple.setmodel ("17 pro");
        System.out.println("the phone model is " + apple.getmodel());


    }
}
class mobile{
    private String model;
    private int ram;
    private int storage;
    private int cameraNo;


public void setmodel(String model){
    this.model = model;
}

public String getmodel(){
   return this.model;
}
}
