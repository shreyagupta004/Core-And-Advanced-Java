import java.util.*;
public class lec_38_constructorChallenge {
    public static void main(String args[]){
        school s1 = new school();
        school s2 = new school("shreya", 52);
        school s3 = new school("riya",19, "cse", "B");
        System.out.println(s3.getstudentName());
        System.out.println(s3.getsection());

    }
    public static class school{
        private String studentName;
        private int rollNo;
        private String standard;
        private String section;
        public String getstudentName(){
            return studentName;
        }
        public int getrollNo(){
            return rollNo;
        }
        public String getstandard(){
            return standard;
        }
        public String getsection(){
            return section;
        }
        public school(String studentName, int rollNo, String standard, String section){
            studentName = studentName;
            rollNo = rollNo;
            standard = standard;
            section = section;
        }

        public school(){
            this("defName", 52, "CS", "B");
        }

        public school(String studentName, int rollNo){
            this(studentName, rollNo, "cse","c");
        }
    }
}
