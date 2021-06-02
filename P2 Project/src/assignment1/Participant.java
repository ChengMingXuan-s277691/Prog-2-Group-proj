package assignment1;
import java.util.Scanner;

public class Participant {
	Scanner scan = new Scanner(System.in);
	
	private String name;
	private String teamName;
	private String gender;
	private int age;
	private int noOfParticipant;
	
	public Participant() {
		System.out.println("————————————————————————————————"
				          +"\nParticipant\n");
		setName();
		setTeamName();
		setGender();
		setAge();
		setNoOfParticipant();
	}
	
	public Participant(String name, String teamName,String gender,int age,int quantity) {
		this.name = name;
		this.teamName = teamName;
		this.gender = gender;
		this.age=age;
		this.noOfParticipant=quantity;
	}
	
	public void setName() {
		System.out.print("Participant name: ");
		this.name=scan.nextLine();
	}
	
	public void setTeamName() {
		System.out.print("Team name: ");
		this.teamName=scan.nextLine();
	}
	
	public void setGender() {
		System.out.print("Gender(m/f)"
						+"(m-Male,f-female): ");
		this.gender=scan.nextLine();
		if(this.gender=="m")
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
	
	public String getName() {
		return this.name;
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
	
	public String toString() {
		return "————————————————————————————————"
			   +"\nParticipant Data\n"
			   +"\nParticipant name : "+name
			   +"\nTeam name        : "+teamName
			   +"\nGender           : "+gender
			   +"\nAge              : "+age
			   +"\nQuantity         : "+noOfParticipant;
	}
	
}
