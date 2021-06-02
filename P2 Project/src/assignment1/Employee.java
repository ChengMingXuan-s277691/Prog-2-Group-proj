package assignment1;
import java.util.Scanner;

public class Employee {
	Scanner scan = new Scanner(System.in);

	private String name;
	private int employeeID;
	private String department;
	private double salary;
	
	public Employee() {
		System.out.println("————————————————————————————————");
		System.out.println("Employee");
		setName();
		setEmployeeID();
		setDepartment();
		setSalary();
		System.out.println("————————————————————————————————");
	}

	public Employee(String name, int employeeID, String department,double salary) {
		this.name = name;
		this.employeeID = employeeID;
		this.department = department;
		this.salary=salary;
	}

	public void setName() {
		System.out.print("\nEnter employee name: ");
		this.name=scan.nextLine();
	}
	
	public void setDepartment() {
		System.out.print("\nEnter department: ");
		this.department=scan.nextLine();
	}
	
	public void setEmployeeID() {
		System.out.print("\nEnter employee ID: ");
		this.employeeID=scan.nextInt();
		scan.nextLine();
	}
	
	public void setSalary() {
		System.out.print("\nEnter salary per hour: RM");
		this.salary=scan.nextDouble();
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public int getEmployeeID() {
		return this.employeeID;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public String toString() {
		return  "————————————————————————————————"
			   +"\nEmployee Data\n"
			   +"\nEmployee Name  : "+name
			   +"\nEmployee ID    : "+employeeID
			   +"\nDepartment     : "+department
			   +"\nEmployee salary: RM"+salary
			   +"\n————————————————————————————";
	}

}
