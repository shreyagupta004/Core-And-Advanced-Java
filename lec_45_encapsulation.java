public class lec_45_encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("shreya");
        s1.setAge(22);
        s1.setSection("3B");
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getSection());
        
    }
    public static class Student{
        private String name;
        private int age;
        private String section;

        public void setName(String name){         // setter----
            this.name = name;                
        }
        public String getName(){                  //getter-----
            return name;
        }
        public void setAge(int age){
            this.age=age;
        }
        public int getAge(){
             return age;
        }
        public void setSection(String section){
            this.section = section;
        }
        public String getSection(){
            return section;
        }


    }
}
