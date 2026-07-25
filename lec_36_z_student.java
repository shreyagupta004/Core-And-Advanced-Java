public class lec_36_z_student {
     public static void main(String args[]){
        Student sc = new Student();
        sc.setfirstName("shreya");
        sc.setlastName("gupta");
        sc.setmarks(20);
        System.out.println(sc.getFullName());
        System.out.println(sc.getmarks());
        System.out.println(sc.isPass());
       
      
    }
}

    

     class Student{
        private String firstName;
        private String lastName;
        private int marks;



        public void setfirstName(String name){
            this.firstName = name;
        }
        public String getfirstName(){
            return firstName;
        }


        public void setlastName(String name){
            this.lastName = name;
        }
        public String getlastName(){
            return lastName;
        }

        public void setmarks(int mark){
            this.marks = mark;
        }
        public int getmarks(){
            return marks;
        }

        public String getFullName(){
            return getfirstName() + " " + getlastName();
        }

        public void setMarks(int marks){
            if(marks > 100 || marks < 0){
                this.marks = 0;
            }else{
                this.marks = marks;
            }
        }

        public boolean isPass(){
            if(marks >= 33 && marks <= 100){
                return true;
            }else {
                return false;
            }
        }


    }

