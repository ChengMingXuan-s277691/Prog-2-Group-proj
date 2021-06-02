package assignment1;
import java.util.Scanner;

public class EventDescription {
	Scanner scan = new Scanner(System.in);
	
	private String eventName;
	private String category;
	private String location;
	private String contact;
	private double registrationFee;
	
	public EventDescription() {
		System.out.println("————————————————————————————————");
		setEventName();
		setCategory();
		setLocation();
		setContact();
		setRegistrationFee();
		System.out.println("————————————————————————————————");
	}
	
	public EventDescription(String name,String category,String location,String contact,double registrationFee) {
		this.eventName=name;
		this.location=location;
		this.category=category;
		this.contact=contact;
		this.registrationFee=registrationFee;
	}
	
	public void setEventName() {
		System.out.print("\nEnter event name: ");
		this.eventName=scan.nextLine();
	}
	
	public void setContact() {
		System.out.print("\nEnter contact number: ");
		this.contact=scan.nextLine();
	}
	
	public void setCategory() {
		System.out.print("\nEnter category: ");
		this.category=scan.nextLine();
	}
	
	public void setLocation() {
		System.out.print("\nEnter Location: ");
		this.location=scan.nextLine();
	}
	
	public void setRegistrationFee() {
		System.out.print("\nEnter registration fee: RM");
		this.registrationFee=scan.nextDouble();
	}
	
	public String getEventName() {
		return  eventName;
	}
	
	public String getCategory() {
		return category;
	}

	public String getLocation() {
		return location;
	}

	public String getContact() {
		return contact;
	}

	public double getRegistrationFee() {
		return registrationFee;
	}

	@Override
	public String toString() {
		return   "————————————————————————————————"
				+"\nEvent Description of " + eventName 
				+ "\nCategory        : " + category 
				+ "\nLocation        : " + location
				+ "\nContact         : " + contact 
				+ "\nRegistration Fee: RM" + registrationFee
				+"\n————————————————————————————————";
	}
	
	
	
	

	
}
