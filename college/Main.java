package college;
import college.office.employee;
public class Main {
    public static void main(String[] args) {
        student s = new student();
        teacher t = new teacher();
        employee e = new employee();
        s.display();
        t.display();
        t.subtract(6, 4);
        e.show();
        
    }
}
