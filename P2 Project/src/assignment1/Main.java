package assignment1;

public class Main {

	public static void main(String[] args) {
		TaekwondoDojang uumDojang=new TaekwondoDojang("UUM Dojang", "Sintok", "+603-2610 3000", 200);
		System.out.println(uumDojang.toString());
		
		EventDescription detail=new EventDescription("Annual Event","LIGHTWEIGHT","UUM Sintok","+603-2610 3000",250);
		System.out.println(detail.toString());
		
		Finance management=new Finance();
		System.out.println(management.toString());
		System.out.println("Net Profit: RM"+management.calNetProfit(detail.getRegistrationFee()));
		
		Participant player=new Participant();
		System.out.println(player.toString());
		
		Employee worker=new Employee();
		System.out.println(worker.toString());
		
		Marketing strategy=new Marketing();
		System.out.println(strategy.toString());
		strategy.printAdvertisement();
	}

}
