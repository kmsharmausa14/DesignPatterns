package Composite.Example1;

public class Company {

  public static void main(String[] args) {
    Employee emp1 = new Developer(1,"A", "Junior Developer");
    Employee emp2 = new Developer(2,"B", "Senior Developer");

    Directory engDirectory = new Directory();
    engDirectory.addEmployee(emp1);
    engDirectory.addEmployee(emp2);

    Employee emp3 = new Manager(3,"C", "Junior Manager");
    Employee emp4 = new Manager(4,"D", "Senior Manager");

    Directory accountDirectory = new Directory();
    accountDirectory.addEmployee(emp3);
    accountDirectory.addEmployee(emp4);

    Directory companyDirectory = new Directory();
    companyDirectory.addEmployee(engDirectory);
    companyDirectory.addEmployee(accountDirectory);
    companyDirectory.showEmployeeDetails();
  }
}
