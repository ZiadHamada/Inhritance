public class Person {
    String name, address, phone, email;
    public Person(){
        
    }
    public Person(String name){
        this.name = name;
    }
    public Person(String name, String address, String phone, String email){
        this.name = name;
        this.address =address;
        this.phone = phone;
        this.email = email;
    }
    public void display(){
        System.out.println("Name: " + name + "\tAddress: " + address + "\tPhone: " + phone + "\tEmail: " + email);
    }
    public String toString(){
        return "Class: " + this.getClass().getName() + "\tName:" + name;
    }
}
