public class Student extends Person {
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    public Student(){
        
    }
    public Student(String name){
        super(name);
    }
    public Student(String name, String address, String phone, String email){
        super(name, address, phone, email);
    }
    public void display(){
        super.display();
        System.out.println("Status: " + FRESHMAN);
    }
    public String toString(){
        return "Class: " + this.getClass().getName() + "\tName:" + name;
    }
}
