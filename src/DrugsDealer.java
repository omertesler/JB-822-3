
public class DrugsDealer extends Person implements Dealer{

	
	public DrugsDealer(String id, String name) {
		super(id, name);
	}

	private AddictedPlayer[] addictedPlayers;
	private  int amountOfDrugs = 50;
	private final int amountEachConsume = 10;
      

	@Override
	public void deal() {

		for(int i = 0 ; i < addictedPlayers.length ; i++) {
			if(amountOfDrugs >= amountEachConsume) {
				addictedPlayers[i].consume();
				amountOfDrugs = amountOfDrugs - amountEachConsume;
				System.out.println("i have " + amountOfDrugs + " left . ");
			}
			
		
			
			
		}
			
		
	}

	
	
}




/*  DrugsDealer: a Person who is also a Dealer.
 *  has a list of addictedplayers to deal to and a specific amount of drugs to deal(in grams)*/ 
