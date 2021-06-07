package assignment2;
import java.util.Scanner;

public class Marketing extends EventDescription implements DiscountPrice{
	Scanner scan = new Scanner(System.in);
	
	private double prize;
	private String day;
	
	//constructor
	public Marketing(String name, String location, String contact, int noOfMember, String eventName, String category,
			double registrationFee, double prize, String day) {
		super(name, location, contact, noOfMember, eventName, category, registrationFee);
		this.prize = prize;
		this.day = day;
	}
	
	//setter getter
	public void setPrize() {
		System.out.print("\nEnter total value of prize: RM");
		this.prize =scan.nextDouble();
	}

	public void setDay() {
		scan.nextLine();
		System.out.print("Enter register day(mon-sun): ");
		this.day = scan.nextLine();
	}

	public double getPrize() {
		return prize;
	}

	public String getDay() {
		return day;
	}
	
	//implementation of Payment class
	//overloading totalPrice, getRegistrationFee() from EventDescription
	public double totalPrice() {
		return getRegistrationFee();
	}
	//total price of registration fee
	public double totalPrice(int noOfParticipant) {
		return getRegistrationFee()*noOfParticipant;
	}
	//discount if day is weekend
	public double totalPrice(String day,int noOfParticipant) {
		if (day=="sun"||day=="sat") 
			return totalPrice(noOfParticipant)*0.75;
		else
			return totalPrice(noOfParticipant);
	}
	
	//Overriding printInfo(ads)
	public void printInfo() {
		System.out.println("--------------------------------"
						  +"\nChallenge accepted!!"
						  +"\nJoin the tournament today!!"
						  +"\nWin up to RM"+getPrize()+" of total prize!!"
						  +"\nOnly RM"+getRegistrationFee()+" for each register."
						  +"\nAlso enjoy up to 25% off during weekend!!"
						  +"\n--------------------------------");
	}

	@Override
	public String toString() {
		return  "————————————————————————————————"
				+"\nMarketing"
				+"\nTotal prize value=" + prize 
				+"\nDay of the week=" + day 
				+"\nNormal registration Fee= RM" + getRegistrationFee()
				+"\nAfter disount= RM"+getRegistrationFee()*0.75;
	}
	
	
	
	
	
}
