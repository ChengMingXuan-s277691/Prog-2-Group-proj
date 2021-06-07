package assignment2;
import java.util.Scanner;

//Inheritance
public class EventDescription extends TaekwondoDojang{
	Scanner scan = new Scanner(System.in);
	
	private String eventName;
	private String category;
	private String location;
	private String contact;
	private double registrationFee;
	
	//constructor
	public EventDescription(String name, String location, String contact, int noOfMember, String eventName,String category, double registrationFee) {
		super(name, location, contact, noOfMember);
		this.eventName = eventName;
		this.category = category;
		this.location=location;
		this.contact=contact;
		this.registrationFee = registrationFee;
	}

	public EventDescription(String name, String location, String contact, int noOfMember) {
		super(name, location, contact, noOfMember);
		System.out.println("————————————————————————————————");
		setEventName();
		setCategory();
		setRegistrationFee();
		System.out.println("————————————————————————————————");
	}
	
	//setter and getter
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
	
	////overriding printInfo
	public void printInfo() {
		System.out.println("--------------------------------"
		                  +"\nWelcome to "+getName()
		                  +"\nWe are at "+location+"!"
		                  +"\nContact number: "+contact
		                  +"\nJoin our family and learn together with our "+getNoOfMember()+"+ members!!"
		                  +"\n--------------------------------"
		                  +"\nOngoing event: "+eventName
		                  +"\nFor "+category
		                  +"\nRegistration Fee: RM" + registrationFee
		                  +"\n--------------------------------");
	}
	
	@Override
	public String toString() {
		return   "————————————————————————————————"
				+ "\nWelcome to Taekwondo Dojang"
				+ "\nName             : " + getName() 
				+ "\nNumber of members: "+ getNoOfMember()
				+"\n————————————————————————————————"
				+"\nEvent Description of " + eventName 
				+ "\nCategory        : " + category 
				+ "\nLocation        : " + location
				+ "\nContact         : " + contact 
				+ "\nRegistration Fee: RM" + registrationFee
				+"\n————————————————————————————————";
	}
	
	
	
	

	
}
