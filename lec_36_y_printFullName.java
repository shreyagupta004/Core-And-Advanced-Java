public class lec_36_y_printFullName{
     public static void main(String args[]){
         Name sc = new Name();
         sc.setfirstName("shreya");
         sc.setlastName("gupta");
        //  String name = sc.getName();
        //  System.out.println(name);
        System.out.println(sc.getName());

     }
    }

    class Name{
        private String firstName;
        private String lastName;
    


    public void setfirstName(String name){
        this.firstName = name;
    }

    public String getfirstName(){
        return this.firstName;
    }

    public void setlastName(String name){
        this.lastName = name;
    }
    public String getlastName(){
        return lastName;
    }

    public String getName(){
        return getfirstName() + " " + getlastName();
    }

}
