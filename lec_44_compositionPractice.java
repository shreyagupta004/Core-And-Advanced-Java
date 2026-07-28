public class lec_44_compositionPractice {
    public static void main(String args[]){
        Author obj = new Author("shreya",22);
        book b = new book("the life of pi ",500.66,obj);
        b.displayBook();
        

         Processor obj1 = new Processor("intel", 8, 3.5);
        Laptop lap = new Laptop("dell" ,"pro",obj1);
        lap.displayLaptop();



        Professor p = new Professor("shreya", "english");
        Department d = new Department("CSE", p);
        University u = new University("BBD", d);
        u.displayUniversity();


    }
    public static class book{
        private String title;
        private double price;
        private Author author;

        public String getitle(){
            return this.title;
        }
        public double getPrice(){
            return this.price;
        }
        public Author getAuthor(){

            return this.author;
        }
         
        public book(String title,double price, Author author){
             this.title = title;
            this.price = price;
            this.author = author;
        }
        public void displayBook(){
            System.out.println("title is "+ title);
            System.out.println("price is " + price);
            author.displayAuthor();
            
        }
    }

    public static class Author{
        private String name;
        private int age;
        public String getName(){
            return this.name;
        }
        public int getAge(){
            return this.age;
        }
        public Author(String name, int age){
            this.name = name;
            this.age= age;
        }
         public void displayAuthor(){
            
            System.out.println("name is " +name);
            System.out.println("age is " + age);

         }
    }



    public static class Processor{
        private String brand;
        private int cores;
        private double speed;
        public String getBrand(){
            return this.brand;
        }
        public int getCores(){
            return this.cores;
        }
        public double getSpeed(){
            return this.speed;
        }
        public Processor(String brand, int cores, double speed){
            this.brand = brand;
            this.cores = cores;
            this.speed = speed;
        }
        public void displayProcessor(){
            System.out.println("Brand: " +brand);
            System.out.println("Core: "+cores);
            System.out.println("Speed: "+speed);
        }
    }

    public static class Laptop{
        private String company;
        private String model;
        private Processor processor;
        public String getCompany(){
            return this.company;
        }
        public String getModel(){
            return this.model;
        }
        public Laptop(String company,String model, Processor processor ){
            this.company = company;
            this.model = model;
            this.processor = processor;

        }
        public void displayLaptop(){
            System.out.println("Company: "+company);
            System.out.println("Model: "+model);
            processor.displayProcessor();     //composition----
        }
    }


    public static class Professor{
        private String name;
        private String subject;

        public String getName(){
            return this.name;
        }
        public String subject(){
            return this.subject;
        }
        public Professor(String name, String subject){
            this.name = name;
            this.subject = subject;
        }
        public void displayProfessor(){
            System.out.println("professor is " + name);
            System.out.println("subject is " + subject);
        }
    }

    public static class Department{
        private String departmentName;
        private Professor professor;

        public String getDepartmentName(){
            return this.departmentName;
        }
        public Professor getProfessor(){
            return this.professor;
        }

         public Department(String departmentName,Professor professor ){
            this.departmentName = departmentName;
            this.professor = professor;
         }
         public void displayDepartment(){
            System.out.println("department name is " + departmentName);
            professor.displayProfessor();
         }
    }
    public static class University{

        private String universityName;
        private Department department;

        public String getUniversityName(){
            return this.universityName;
        }

        public University(String universityName, Department department ){
            this.universityName = universityName;
            this.department= department;
           
        }
        public void displayUniversity(){
            System.out.println("university name is " + universityName);
            department.displayDepartment();   
        }
    }
}
