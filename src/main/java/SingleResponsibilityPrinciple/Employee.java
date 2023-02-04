package SingleResponsibilityPrinciple;

import java.util.Date;

public class Employee {

  public String getEmployeeId() {
    return EmployeeId;
  }

  public void setEmployeeId(String employeeId) {
    EmployeeId = employeeId;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Date getDateOfJoining() {
    return dateOfJoining;
  }

  public void setDateOfJoining(Date dateOfJoining) {
    this.dateOfJoining = dateOfJoining;
  }

  private String EmployeeId;
    private String employeeName;
    private String address;
    private Date dateOfJoining;
}
