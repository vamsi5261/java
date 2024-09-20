/*Write a Java program to create a class called 
 * "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary*/
package oops;
import java.util.*;
public class Employee {
	String name;
	String jobtitle;
	double salary;
	public Employee(String name,String jobtitle,double salary) {
		this.name=name;
		this.jobtitle=jobtitle;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	
	public String getJobtitle() {
		return jobtitle;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void inc(double per) {
		salary=salary+salary*(per/100);
	}
	public void emp() {
		System.out.println("Name:"+name+" "+"JobTitle:"+" "+jobtitle+" "+"Salary:"+salary);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String jobtitle=sc.nextLine();
        double salary=sc.nextInt();
        Employee em=new Employee(name,jobtitle,salary);
        em.emp();
        double per=sc.nextDouble();
        em.inc(per);
        System.out.println("Employee will get "+per+" percentage of increment");
        em.emp();
        sc.close();
	}

}
