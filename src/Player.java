
public  class Player extends Person implements Consumer {
	
	public Player(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public void consume() {
		System.out.println("Recieved card from dealer.");
		
	}
	
}

// Player: a Person who is also a Consumer (Consume the cards dealing)