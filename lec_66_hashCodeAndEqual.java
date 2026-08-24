public class lec_66_hashCodeAndEqual {
    public static void main(String[] args) {

        student s1 = new student("A", "abc");
        student s2 = new student("a", "abc");
        student s3 = new student("c", "mno");
        student s4 = s1;

        System.out.println(s4.getName());
        System.out.println(s4.getId());

        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        
    }
    public static class student{
        String name;
        String id;
        public student(String name , String id){
            this.name = name;
            this.id = id;
            
        }

        public void setName(String name){
            name = name;
        }
        public String getName(){
            return name;
        }

        public void setId(String id){
            id = id;
        }
        public String getId(){
            return id;
        }
    }
}
