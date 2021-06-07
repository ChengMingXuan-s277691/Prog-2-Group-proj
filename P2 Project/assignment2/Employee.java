package assignment2;
import java.util.Scanner;

//Inheritance
public class Employee extends Participant{
	Scanner scan = new Scanner(System.in);

	private String employeeName;
	private int employeeID;
	private String department;
	private double salary;
	
	//constructor with no parameter
	public Employee() {
		System.out.println("————————————————————————————————");
		System.out.println("Employee");
		setEmployeeName();
		setEmployeeID();
		setDepartment();
		setSalary();
		System.out.println("————————————————————————————————");
	}

	public Employee(String employeeName, int employeeID, String department,double salary) {
		this.employeeName = employeeName;
		this.employeeID = employeeID;
		this.department = department;
		this.salary=salary;
	}
	
	//setter and getter
	public void setEmployeeName() {
		System.out.print("Enter employee name: ");
		this.employeeName=scan.nextLine();
	}
	
	public void setDepartment() {
		System.out.print("Enter department: ");
		this.department=scan.nextLine();
	}
	
	public void setEmployeeID() {
		System.out.print("Enter employee ID: ");
		this.employeeID=scan.nextInt();
		scan.nextLine();
	}
	
	public void setSalary() {
		System.out.print("Enter salary per hour: RM");
		this.salary=scan.nextDouble();
	}
	
	public String getemployeeName() {
		return this.employeeName;
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
	
	//overriding printInfo
	public void printInfo() {
		System.out.println("--------------------------------"
					      +"Employee Details"
						  +"\n--------------------------------"
						  +"\n"+employeeName+"(ID:"+employeeID+")"
						  +"\nDepartment of "+department
						  +"\nSalary per event: RM"+salary
					      +"\n--------------------------------");
	}
	
	public String toString() {
		return  "————————————————————————————————"
			   +"\nEmployee Data\n"
			   +"\nEmployee employeeName  : "+employeeName
			   +"\nEmployee ID    : "+employeeID
			   +"\nDepartment     : "+department
			   +"\nEmployee salary: RM"+salary
			   +"\n————————————————————————————";
	}

}
