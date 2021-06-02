package assignment1;
import java.util.Scanner;

public class TaekwondoDojang {
	Scanner scan = new Scanner(System.in);
	
	private String name;
	private String location;
	private String contact;
	private int noOfMember;
	
	
	
	public TaekwondoDojang(String name, String location, String contact, int noOfMember) {
		this.name = name;
		this.location = location;
		this.contact = contact;
		this.noOfMember = noOfMember;
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

	@Override
	public String toString() {
		return  "————————————————————————————————"
			  + "\nWelcome to Taekwondo Dojang"
			  + "\nName             : " + name 
			  + "\nLocation         : " + location 
			  + "\nContact          : " + contact 
			  + "\nNumber of members: "+ noOfMember ;
	}
	
	
}
