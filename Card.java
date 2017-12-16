package johnbrice;

/* class "Card"
a. Use "char" for rank and suit
b. Use constants (static final variables)
c. Use final variables
d. Create only ONE constructor to generate the card
e. "toString" will display the representation of a card. For example, "7D", "AH",...
2. class Deck
a. Contains 52 cards
b. Create a method "deal(n, p)" that will RANDOMLY select "n" cards for 
	each one of the "p" players. For example: deal(5, 6) will randomly
	select 30 cards and split them equally (5 for each on of the 6 players).
	The method will return a Card[][] (array of arrays of Card).
*/
public class Card {
	
	//suits
	public static final String DIAMONDS = "";
	public static final String SPARES = "";
	public static final String CLUBS = "";
	public static final String HEARTS = "";
	
	//ranks
	public static final String ACE = "";
	public static final String TWO = "";
	public static final String THREE = "";
	public static final String FOUR = "";
	public static final String FIVE = "";
	public static final String SIX = "";
	public static final String SEVEN = "";
	public static final String EIGHT = "";
	public static final String NINE = "";
	public static final String TEN = "";
	public static final String JACK = "";
	public static final String QUEEN = "";
	public static final String KING = "";
	
	private String suit;
	private String rank;

		

			public Card(String suit , String rank) {
			
				suit = this.suit;
				rank = this.rank;
				
		
				
			}

	       public String toString() {
	    	   String  St = "";
	    	   String  Rk = "";
	    	  
	    	   
	    	   //check suit
	    	   if(DIAMONDS == this.suit) {
	    		   St = St + "D";
	    	   }
	    	
	    	   
	    	   else if
	    
	    	   (SPARES == this.suit) {
	    		   St = St + "S";    
	    	   }
			 
	    	   else if
	   	    
	    	   (CLUBS== this.suit) {
	    		   St = St + "C";    
	    	   }
	    	   
	    	   else if
	   	    
	    	   (HEARTS == this.suit) {
	    		   St = St + "H";    
	    	   }
	    	   
	    	   
	    	   else if
		   	    
	    	   (ACE == this.rank) {
	    		   Rk = Rk + "ACE";    
	    	   }
	    	   
	    	   else if
		   	    
	    	   (TWO == this.rank) {
	    		   Rk = Rk + "2";    
	    	   }
	    	   
	    	   else if
		   	    
	    	   (THREE == this.rank) {
	    		   Rk = Rk + "3";    
	    	   }
	    	   
	    	   else if
		   	    
	    	   (FOUR == this.rank) {
	    		   Rk = Rk + "4";    
	    	   }
	    	   
	    	   else if
		   	    
	    	   (FIVE == this.rank) {
	    		   Rk = Rk + "5";    
	    	   }
	    	   
	    	   else if
		   	    
	    	   (SIX == this.rank) {
	    		   Rk = Rk + "6";    
	    	   }
	    	   
	    	   else if
		   	    
	    	   (SEVEN == this.rank) {
	    		   Rk = Rk + "7";    
	    	   }
	    	   
	    	   else if
		   	    
	    	   (EIGHT == this.rank) {
	    		   Rk = Rk + "8";    
	    	   }
	    	   
	    	   else if
		   	    
	    	   (NINE == this.rank) {
	    		   Rk = Rk + "9";    
	    	   }
	    	   
	    	   else if
		   	    
	    	   (TEN == this.rank) {
	    		   Rk = Rk + "10";    
	    	   }
	    	   
	    	   else if
		   	    
	    	   (JACK == this.rank) {
	    		   Rk = Rk + "JACK";    
	    	   }
	    	   
	    	   else if
		   	    
	    	   (QUEEN == this.rank) {
	    		   Rk = Rk + "QUEEN";    
	    	   }
	    	   
	    	   else if
		   	    
	    	   (KING == this.rank) {
	    		   Rk = Rk + "KING";    
	    	   }
   
	    	   return "The card is : " +  St + Rk;
	       }
	       
	     
		
		}
		
	
	
	


