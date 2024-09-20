/*Write a Java program to create a class called Employee with methods called work() and getSalary(). 
 * Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().*/
package inheritance;
import java.util.*;
public class Employee {
	Scanner sc=new Scanner(System.in);
	public void work(){
		System.out.println("Does some work");
	}
	public void getSalary() {
		double salary=sc.nextDouble();
		System.out.println(salary);
	}
	public static class manager extends Employee {
		//@Override
		public void work() {
			System.out.println("Managing the team");
		}
		public void addEmployee() {
	        System.out.println("The HR Manager is adding a new employee.");
	    }
	}
    
	public static void main(String[] args) {
		manager emp=new manager();
        emp.work();
        emp.addEmployee();
        emp.getSalary();
	}

}
