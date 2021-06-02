package assignment1;
import java.util.Scanner;

public class Finance {
	Scanner scan = new Scanner(System.in);
	
	private double salary;
	private double utilityFee;
	private double advertisementFee;
	private double prize;
	private int employeeQuantity;
	private int participantQuantity;
	
	public  Finance() {
		System.out.println("————————————————————————————————"
				         + "\nFinance\n");
		setSalary();
		setUtilityFee();
		setAdvertisementFee();
		setPrize();
		setEmployeeQuantity();
		setParticipantQuantity();
	}
	
	public Finance(double salary, double utilityFee, double advertisementFee, double prize, int employeeQuantity,
			int participantQuantity) {
		this.salary = salary;
		this.utilityFee = utilityFee;
		this.advertisementFee = advertisementFee;
		this.prize = prize;
		this.employeeQuantity = employeeQuantity;
		this.participantQuantity = participantQuantity;
	}
	
	public void setSalary() {
		System.out.print("\nEnter salary: RM");
		this.salary = scan.nextDouble();
	}

	public void setUtilityFee() {
		System.out.print("\nEnter utility fee: RM");
		this.utilityFee = scan.nextDouble();
	}

	public void setAdvertisementFee() {
		System.out.print("\nEnter advertisement fee: RM");
		this.advertisementFee = scan.nextDouble();
	}

	public void setPrize() {
		System.out.print("\nEnter prize value: RM");
		this.prize = scan.nextDouble();
	}

	public void setEmployeeQuantity() {
		System.out.print("\nEnter number of employee : ");
		this.employeeQuantity = scan.nextInt();
	}

	public void setParticipantQuantity() {
		System.out.print("\nEnter number of participants : ");
		this.participantQuantity = scan.nextInt();
	}

	public double getSalary() {
		return salary;
	}

	public double getUtilityFee() {
		return utilityFee;
	}

	public double getAdvertisementFee() {
		return advertisementFee;
	}

	public double getPrize() {
		return prize;
	}

	public int getEmployeeQuantity() {
		return employeeQuantity;
	}

	public int getParticipantQuantity() {
		return participantQuantity;
	}
	//calculate the total salary
	public double totalSalary() {
		return this.salary*this.employeeQuantity;
	}
	//cal the total cost
	public double totalBudget() {
		return this.utilityFee+this.advertisementFee+this.prize;
	}
	//cal the net profit
	public double calNetProfit(double registrationFee) {
		double profit=registrationFee*getParticipantQuantity()-totalSalary()-totalBudget();
		return profit;
	}

	@Override
	public String toString() {
		return    "————————————————————————————————"
				+ "\nFinance\n"
				+ "\nUtility fee        = RM" + utilityFee 
				+ "\nAdvertisementFee   = RM"+ advertisementFee 
				+ "\nPrize value        = RM" + prize 
				+ "\nEmployeeQuantity   = " + employeeQuantity
				+ "\nParticipantQuantity= " + participantQuantity
				+ "\nTotal salary       = RM"+totalSalary()
				+ "\nTotal budget       = RM"+totalBudget()
				+ "\n————————————————————————————————"
				;
	}
	
	

	

}
