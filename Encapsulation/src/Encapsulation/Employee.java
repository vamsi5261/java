//Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, 
//and employee_salary. Provide public getter and setter methods to access and modify the id and name variables,
//but provide a getter method for the salary variable that returns a formatted string.
package Encapsulation;

class Employee {
	  private int employee_id;
	  private String employee_name;
	  private double employee_salary;

	  public int getEmployeeId() {
	    return employee_id;
	  }

	  public void setEmployeeId(int employeeId) {
	    this.employee_id = employeeId;
	  }

	  public String getEmployeeName() {
	    return employee_name;
	  }

	  public void setEmployeeName(String employeeName) {
	    this.employee_name = employeeName;
	  }
      
	  public double getEmployeeSalary() {
	    return employee_salary;
	  }

	  public void setEmployeeSalary(double employeeSalary) {
	    this.employee_salary = employeeSalary;
	  }

	  public String getFormattedSalary() {
	    return String.format("$%.2f", employee_salary);
	  }
	  public static void main(String[] args) {
		    
		    Employee employee = new Employee();
		    employee.setEmployeeId(15);
		    employee.setEmployeeName("Caelius Dathan");
		    employee.setEmployeeSalary(4900.0);
		    int employeeId = employee.getEmployeeId();
		    String employeeName = employee.getEmployeeName();
		    String formattedSalary = employee.getFormattedSalary();
		    System.out.println("Employee Details:");
		    System.out.println("ID: " + employeeId);
		    System.out.println("Name: " + employeeName);
		    System.out.println("Salary: " + formattedSalary);
		  }
		
	}
