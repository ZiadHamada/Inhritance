public class Faculty extends Employee{
    String office_hours;
    String rank;
    public Faculty(){

    }
    public Faculty(String name){
        super(name);
    }
    public Faculty(String office_hours, String rank, String office, float salary, MyDate date_hired,String name, String address, String phone, String email){
        super(office, salary, date_hired, name, address, phone, email);
        this.office_hours = office_hours;
        this.rank = rank;
    }
    public void display(){
        super.display();
        System.out.println("Office Hours: " + office_hours + "\tRank: " + rank);
    }
    public String toString(){
        return "Class: " + this.getClass().getName() + "\tName:" + name;
    }
}
