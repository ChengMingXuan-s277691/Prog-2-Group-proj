package assignment2;
import java.util.Scanner;

//abstract super class
public abstract class TaekwondoDojang {
	Scanner scan = new Scanner(System.in);
	
	private String name;
	private String location;
	private String contact;
	private int noOfMember;
	
	public TaekwondoDojang(String name, String location, String contact, int noOfMember) {
		this.name = name;
		this.location = location;
		this.contact = contact;
		this.noOfMember=noOfMember;
	}

	public TaekwondoDojang (String name){
		this.name=name;
		System.out.print("\nEnter employee name: ");
		this.location=scan.nextLine();
		System.out.print("\nEnter employee name: ");
		this.contact=scan.nextLine();
		System.out.print("\nEnter employee name: ");
		this.noOfMember=scan.nextInt();
	}
	
	public void setName() {
		System.out.println("Enter name of taekwondo dojang: ");
		this.name=scan.nextLine();
	}

	public void setLocation() {
		System.out.println("Enter location of dojang: ");
		this.location =scan.nextLine();
	}

	public void setContact(String contact) {
		System.out.println("Enter contact number: ");
		this.contact = scan.nextLine();
	}

	public void setNoOfMember(int noOfMember) {
		System.out.println("Enter members number: ");
		this.noOfMember = scan.nextInt();
	}

	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public String getContact() {
		return contact;
	}
	public int getnoOfMember() {
		return noOfMember;
	}
	
	//Overriding method
	public void printInfo() {
		System.out.println("--------------------------------"
		                  +"Welcome to "+name
		                  +"We are at "+location
		                  +"Contact number: "+contact
		                  +"Join our family and learn together with our "+noOfMember+"+ members!!"
		                  +"--------------------------------");
	}
	
	@Override
	public String toString() {
		return  "————————————————————————————————"
			  + "\nWelcome to Taekwondo Dojang"
			  + "\nName             : " + name 
			  + "\nLocation         : " + location 
			  + "\nContact          : " + contact 
			  + "\nNumber of members: "+ noOfMember;
	}

	public int getNoOfMember() {
		return noOfMember;
	}
	
	
}
