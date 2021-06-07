package assignment2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EventDescription detail=new EventDescription("UUM Dojang", "Sintok", "+603-2610 3000", 200,"Annual Event","Light weight",250);
		detail.printInfo();
		
		int choice=0;
		
		do {
			//able user to register or check financial
			System.out.println("I am a......"
					  	      +"\n1-Participant"
					  		  +"\n2-Admin");
			choice=scan.nextInt();
			
			if(choice==1) {
				Marketing strategy=new Marketing("UUM Dojang", "Sintok", "+603-2610 3000", 200,"Annual Event","Light weight",250, 500, "sun");
				strategy.printInfo();
				
				Participant player=new Participant();
				player.printInfo();
				
				System.out.printf("The total registration fee is RM%.2f.",player.getPayment(detail.getRegistrationFee()));
			}
			else if(choice==2) {
				Finance management=new Finance();
				management.printInfo();
				System.out.println("Net Profit: RM"+management.calNetProfit(detail.getRegistrationFee()));
			}
			else {
				System.out.println("Invalid input. Try again.");
				choice=0;
			}
		}while(choice==0);
		
	}

}
