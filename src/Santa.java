import java.util.Scanner;
 class Santa implements Dealer {

	 Scanner input = new Scanner(System.in);
	 
	private  int toys = 50;
	private final int amountOfToys = 10;
	
	@Override
	public void deal() {
		
		
		while( toys <= 50) {
			if(amountOfToys <= toys) {
				toys = toys - amountOfToys;
				System.out.println("i now have just " + toys + " toys " + " left. " );
				System.out.println("would you like more toys?");
				 String moretoys = input.next();
				if(moretoys == "no") {
					 System.out.println("good bye");
					 input.close();	
				 }
			
				 else if (moretoys == "yes") {
					 
				 }
					 
				 
				 
				 
		
		}
		
		
	}

	}
 }


/*Santa: a Dealer of toys. Has a limited number of toys to deal.
has a limited amount of toys
when are no toys to deal the dealing action will do nothing*/