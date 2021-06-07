package assignment2;
import java.util.Scanner;

public class Participant implements Payment{
	Scanner scan = new Scanner(System.in);

	private String participantName;
	private String teamName;
	private String gender;
	private int age;
	private int noOfParticipant;
	
	//constructor
	public Participant(String participantName, String teamName,String gender,int age,int quantity) {
		this.participantName = participantName;
		this.teamName = teamName;
		this.gender = gender;
		this.age=age;
		this.noOfParticipant=quantity;
	}
	
	public Participant() {
		System.out.println("————————————————————————————————"
				          +"\nParticipant\n");
		setParticipantName();
		setTeamName();
		setGender();
		setAge();
		setNoOfParticipant();
	}
	
	//implementation of getPayment method
	public double getPayment(double registrationfee) {
		return registrationfee*noOfParticipant;
	}
	
	//setter getter
	public void setParticipantName() {
		System.out.print("Participant name: ");
		this.participantName=scan.nextLine();
	}
	
	public void setTeamName() {
		System.out.print("Team name: ");
		this.teamName=scan.nextLine();
	}
	
	public void setGender() {
		System.out.print("Gender(m/f)"
						+"(1-Male,2-female): ");
		int gen=scan.nextInt();
		if(gen==1)
			this.gender="Male";
		else
			this.gender="Female";
	}
	
	public void setAge() {
		System.out.print("Age: ");
		this.age=scan.nextInt();
	}
	
	public void setNoOfParticipant() {
		System.out.print("Number of participant: ");
		this.noOfParticipant=scan.nextInt();
	}
	
	public String getParticipantName() {
		return this.participantName;
	}
	
	public String getTeamName() {
		return this.teamName;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getNoOfParticipant() {
		return this.noOfParticipant;
	}
	
	//overriding printInfo
	public void printInfo() {
		System.out.println("--------------------------------"
						  +"\nRegistration details"
						  +"\n--------------------------------"
					      +"\nRegistered by "+participantName
						  +"\nRegister gender: "+gender
						  +"\nAge            : "+age
					      +"\nTeam "+teamName
						  +"\nNumber of team members is "+noOfParticipant+"."
						  +"\n--------------------------------");
	}
	
	public String toString() {
		return "————————————————————————————————"
			   +"\nParticipant Data\n"
			   +"\nParticipant name : "+participantName
			   +"\nTeam name        : "+teamName
			   +"\nGender           : "+gender
			   +"\nAge              : "+age
			   +"\nQuantity         : "+noOfParticipant;
	}
	
}
