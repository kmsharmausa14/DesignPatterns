package Composite.Example1;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Employee{
  List<Employee> employeeList = new ArrayList<>();

  public void addEmployee(Employee employee){
    employeeList.add(employee);
  }

  public void removeEmployee(Employee employee){
    employeeList.remove(employee);
  }

  @Override
  public void showEmployeeDetails() {
    for(int i=0;i<employeeList.size();i++){
      employeeList.get(i).showEmployeeDetails();
    }
  }
}
