package assignment1;
import java.util.Scanner;

public class Marketing {
	Scanner scan = new Scanner(System.in);
	
	private double prize;
	private String day;
	private double registrationFee;

	
	public Marketing() {
		setPrize();
		setDay();
		setRegistrationFee();
	}
	
	public Marketing(int prize) {
		this.prize=prize;
		setDay();
		setRegistrationFee();
	}
	
	public Marketing(int prize, String day) {
		this.prize = prize;
		this.day = day;
		setRegistrationFee();
	}

	public void setPrize() {
		System.out.print("\nEnter total value of prize: RM");
		this.prize =scan.nextDouble();
	}

	public void setDay() {
		scan.nextLine();
		System.out.print("Enter register day(mon-sun): ");
		this.day = scan.nextLine();
	}
	
	public void setRegistrationFee() {
		System.out.print("Enter registration fee: RM");
		this.registrationFee = scan.nextDouble();
	}

	public double getPrize() {
		return prize;
	}

	public String getDay() {
		return day;
	}

	public double getRegistrationFee() {
		return registrationFee;
	}

	public double totalPrice() {
		return registrationFee;
	}
	
	public double totalPrice(int noOfParticipant) {
		return registrationFee*noOfParticipant;
	}
	
	public double totalPrice(String day,int noOfParticipant) {
		if (day=="sun"||day=="sat") 
			return totalPrice(noOfParticipant)*0.75;
		else
			return totalPrice(noOfParticipant);
	}
	
	public void printAdvertisement() {
		System.out.println("————————————————————————————————"
						  +"\nChallenge accepted!!"
						  +"\nJoin the tournament today!!"
						  +"\nWin up to RM"+getPrize()+" of total prize!!"
						  +"\nOnly RM"+getRegistrationFee()+"for each register."
						  +"\nAlso enjoy up to 25% off during weekend!!");
	}

	@Override
	public String toString() {
		return  "————————————————————————————————"
				+"\nMarketing"
				+"\nTotal prize value=" + prize 
				+"\nDay of the week=" + day 
				+"\nNormal registration Fee= RM" + registrationFee
				+"\nAfter disount= RM"+registrationFee*0.75;
	}
	
	
	
	
	
}
