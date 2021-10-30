public class Staff extends Employee{
    String title;
    public Staff(){

    }
    public Staff(String name){
        super(name);
    }
    public Staff(String title, String office, float salary, MyDate date_hired,String name, String address, String phone, String email){
        super(office, salary, date_hired, name, address, phone, email);
        this.title = title;
    }
    public void display(){
        super.display();
        System.out.println("Title: " + title);
    }
    public String toString(){
        return "Class: " + this.getClass().getName() + "\tName:" + name;
    }
}
