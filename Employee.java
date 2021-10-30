public class Employee extends Person{
    String office;
    float salary;
    MyDate date_hired;
    public Employee(){

    }
    public Employee(String name){
        super(name);
    }
    public Employee(String office, float salary, MyDate date_hired,String name, String address, String phone, String email){
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.date_hired = date_hired;
    }
    public void display(){
        super.display();
        System.out.println("Office: " + office + "\tSalary: " + salary + "\tDate Hired: " + date_hired);
    }
    public String toString(){
        return "Class: " + this.getClass().getName() + "\tName:" + name;
    }
}
