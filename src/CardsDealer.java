public class CardsDealer extends Person implements Dealer {

	private Player[] players;
	

	@Override
	public void deal() {
		for(int i=0; i<players.length; i++) {
			players[i].consume();
		}		
	}
	
	public CardsDealer(String id, String name , Player[] players) {
		super(id, name);
		
	}



	



	
}

// CardsDealer: a Person who is also a Dealer. Has a list of players to deal to