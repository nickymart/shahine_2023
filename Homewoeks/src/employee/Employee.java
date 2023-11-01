package employee;

public class Employee {
    String   name;
    String   surname;
    String   employeeID;
    int      salary;
    String   company;
    String   position;

    Employee(){
        this.name =       "";
        this.surname =    "";
        this.employeeID = "";
        this.salary =      0;
        this.company =    "";
        this.position =   "";

    };
    Employee (String name, String surname, String employeeID, int salary, String company, String position){
        this.name =       name;
        this.surname =    surname;
        this.employeeID = employeeID;
        this.salary =     salary;
        this.company =    company;
        this.position =   position;
    }

    public void print() {
        System.out.println("Employee[name:"+ name +", surname:"+ surname + ", ID:"+ employeeID
                + ", salary:"+ salary + ", company:" + company + ", position:" + position + "]");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public int getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
