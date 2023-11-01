package employee;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class EmployeeDemo {
    public static void main(String[] args) {
        EmployeeStorage employeeStorage = new EmployeeStorage();
        while(true){
            System.out.println("Enter: 0- for exit, 1- for add employee, 2- print all employee," +
                    " 3- search employee by employee ID, 4- search employee by company name, " +
                    "5- delete employee by ID, 6- change employee by ID\n");
            String step =  new Scanner(System.in).nextLine();
            switch (step){
                case "0":
                    return;
                case "1": ;
                    employeeStorage.add(input());
                    break;
                case "2":
                    employeeStorage.printAllEmployees();
                    break;
                case "3":
                    System.out.print("EmployeeID: ");
                    String employeeID =  new Scanner(System.in).nextLine();
                    employeeStorage.search(employeeID);
                    break;
                case "4":
                    System.out.print("Company: ");
                    String company =  new Scanner(System.in).nextLine();
                    employeeStorage.searchEmployee(company);
                    break;
                case "5":
                    System.out.print("Employee Id for delete: ");
                    String employeeId =  new Scanner(System.in).nextLine();
                    employeeStorage.deleteById(employeeId);
                    break;
                case "6":
                    System.out.print("Employee Id for change: ");
                    String changedId =  new Scanner(System.in).nextLine();
                    employeeStorage.changeById(changedId);

            }

        }
    }

    public static Employee input(){
        System.out.print("Name: ");
        String name =  new Scanner(System.in).nextLine();
        System.out.print("Surname: ");
        String surname =  new Scanner(System.in).nextLine();
        System.out.print("EmployeeID: ");
        String employeeID =  new Scanner(System.in).nextLine();
        System.out.print("Salary: ");
        int salary =  parseInt(new Scanner(System.in).nextLine());
        System.out.print("Company: ");
        String company =  new Scanner(System.in).nextLine();
        System.out.print("Position: ");
        String position =  new Scanner(System.in).nextLine();
        return new Employee(name, surname, employeeID, salary, company, position);
    }
}
