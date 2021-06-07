package assignment2;
import java.util.Scanner;

//used for calculation of net profit
//get Employee salary from Employee sub class
public class Finance extends Employee{
	Scanner scan = new Scanner(System.in);
	
	private double utilityFee;
	private double advertisementFee;
	private double prize;
	private int employeeQuantity;
	private int participantQuantity;
	
	//constructor
	public  Finance() {
		System.out.println("————————————————————————————————"
				         + "\nFinance\n");
		setUtilityFee();
		setAdvertisementFee();
		setPrize();
		setEmployeeQuantity();
		this.participantQuantity = getNoOfParticipant();
	}

	public Finance(double salary, double utilityFee, double advertisementFee, double prize, int employeeQuantity) {
		this.utilityFee = utilityFee;
		this.advertisementFee = advertisementFee;
		this.prize = prize;
		this.employeeQuantity = employeeQuantity;
		this.participantQuantity = getNoOfParticipant();
	}
	
	//setter getter
	public void setUtilityFee() {
		System.out.print("Enter utility fee: RM");
		this.utilityFee = scan.nextDouble();
	}

	public void setAdvertisementFee() {
		System.out.print("Enter advertisement fee: RM");
		this.advertisementFee = scan.nextDouble();
	}

	public void setPrize() {
		System.out.print("Enter prize value: RM");
		this.prize = scan.nextDouble();
	}

	public void setEmployeeQuantity() {
		System.out.print("Enter number of employee : ");
		this.employeeQuantity = scan.nextInt();
	}

	public void setParticipantQuantity() {
		System.out.print("Enter number of participants : ");
		this.participantQuantity = scan.nextInt();
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
		return getSalary()*this.employeeQuantity;
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
	
	//implementation of getPayment method
	public double getPayment(double registrationfee) {
		return registrationfee*getNoOfParticipant();
	}
	
	//overriding printInfo
	public void printInfo() {
		System.out.println("--------------------------------"
					      +"\nFinance Record"
						  +"\n--------------------------------"
						  +"\nUtility cost: RM"+utilityFee 
						  +"\nAdvertisement cost:RM"+ advertisementFee 
						  +"\nPrize cost    :RM" + prize
						  +"\nSalary cost: RM"+totalSalary()
						  +"\nTotal cost   : RM"+totalBudget()
					      +"\n--------------------------------");
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
