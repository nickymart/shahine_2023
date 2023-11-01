package employee;

import java.util.ArrayList;
import java.util.Objects;

public class EmployeeStorage {
    Employee[] employeeStorage;
    int count = 0;

    EmployeeStorage(){
        this.employeeStorage = new Employee[2];
    }

    public void add(Employee employee){
        if(count == employeeStorage.length)
            extend();
        employeeStorage[count] = employee;
        count++;
    }

    public void extend(){
        Employee[] temp = new Employee[employeeStorage.length * 2];
        System.arraycopy(employeeStorage, 0, temp, 0, employeeStorage.length);
        employeeStorage = temp;
    }

    public void search(String ID) {
        for (int i = 0; i < count; i++) {
            if (ID.equals(employeeStorage[i].getEmployeeID())) {
                System.out.println("The employee with the ID " + ID + " exists in the storage!");
                return;
            }
        }
        System.out.println("The employee with the ID " + ID + " does not exist in the library!");
    }

    public void searchEmployee(String company){
        boolean isExist = false;
        for (int i = 0; i < count; i++) {
            if (company.equals(employeeStorage[i].getCompany())) {
                employeeStorage[i].print();
                isExist = true;
            }
        }
        if(!isExist){
            System.out.println("Employee in that company doesn't exist");
        }
    }

    public void printAllEmployees(){
        for (int i = 0; i < count; i++) {
            employeeStorage[i].print();
        }
    }
}
