import java.util.ArrayList;
import java.util.Collections;

public class lec_59_comparable {
    public static void main(String[] args) {
        ArrayList<phoneDirectory> pd = new ArrayList<>();
        pd.add(new phoneDirectory("shreya" , "12345"));
        pd.add(new phoneDirectory("riya" , "12342"));
        pd.add(new phoneDirectory("anshul" , "12145"));
        pd.add(new phoneDirectory("gaurav" , "12645"));
        pd.add(new phoneDirectory("himanshu" , "92345"));
        pd.add(new phoneDirectory("akansha" , "17345"));

        Collections.sort(pd);

        for(phoneDirectory obj : pd){
            System.out.println(obj.getContactName() + " " + obj.getContactNumber());
        }
    }
    public static class phoneDirectory implements Comparable<phoneDirectory>{
        private String contactName;
        private String contactNumber;

        public String getContactName(){
            return contactName;
        }

        public String getContactNumber(){
            return contactNumber;
        }

        public phoneDirectory(String contactName , String contactNumber){
            this.contactName = contactName;
            this.contactNumber = contactNumber;
        }
        @Override
        public int compareTo(phoneDirectory o){
            if(this.contactNumber.compareTo(o.contactNumber) == 0){
                return 0;
            }else if(this.contactNumber.compareTo(o.contactNumber) > 0){
                return 1;
            }else{
                return -1;
            }
            
        }
    }
}
