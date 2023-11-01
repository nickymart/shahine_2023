package employee;

import static employee.EmployeeDemo.input;

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

    public void searchById(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employeeId.equals(employeeStorage[i].getEmployeeID())) {
                System.out.println("The employee with the ID։" + employeeId + " exists in the storage!");
                return;
            }
        }
        System.out.println("The employee with the ID։" + employeeId + " doesn't exist in the library!");
    }

    public void searchByCompany(String company){
        boolean isExist = false;
        for (int i = 0; i < count; i++) {
            if (company.equals(employeeStorage[i].getCompany())) {
                employeeStorage[i].print();
                isExist = true;
            }
        }
        if(!isExist){
            System.out.println("There isn't employee of that company in the storage.");
        }
    }

    public void deleteById(String employeeId){
        if(count == 0)
            return;

        int index = -1;
        for (int i = 0; i < count; i++)
        {
            if(employeeId.equals(employeeStorage[i].getEmployeeID()))
                index = i;
        }

        if(index == -1)
            return;

        for (int i = index; i < count - 1; i++){
            employeeStorage[i] = employeeStorage[i + 1];
        }
        count--;
    }

    public void changeById(String employeeId){
        for (int i = 0; i < count; i++)
        {
            if(employeeId.equals(employeeStorage[i].getEmployeeID())) {
                employeeStorage[i] = input();
                return;
            }
        }
        System.out.println("There is no employee with the given ID");
    }

    public void printAllEmployees(){
        for (int i = 0; i < count; i++) {
            employeeStorage[i].print();
        }
    }
}
