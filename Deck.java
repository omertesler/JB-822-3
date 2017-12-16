package johnbrice;

import java.util.Arrays;

public class Deck {
	public static void main(String[] args) {
		
	}
	private Card[] deck = new Card[52];
	
	   public Deck(){
		   
		   
	       String[] Ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",    "Jack", "Queen", "King", "Ace"};
	   String[] Suits = {"Spades", "Clubs", "Diamonds", "Hearts"};



	   for (int suit = 0; suit < 4; suit++) {
	   
	       for (int rank = 0; rank < 13; rank++){


	           deck [(rank + (suit))] = new Card(Suits[suit],Ranks[rank]);
	       }
	       
	       
	   
	       
	       
	   }
	   }

	public String toString() {
		return "Deck [deck=" + Arrays.toString(deck) + "]";
	}
		
		
		
		
		
		
		
		
}
	
		

		
					

		

	
	

		
	


