import java.util.Scanner;
import java.util.Random;


public class Casino {
	
	
	private final Player[][] Player = null;


	
	 Scanner input = new Scanner(System.in);
	 Random random = new Random();
	
	public  void start() {
		
	System.out.println("welcome to my casino");
	System.out.println("please choose your will : ");
	System.out.println("1 for cards");
	System.out.println("2 for drugs");
	System.out.println("3 for toys");
		
	 int will = input.nextInt();
	 
	 switch(will) {
	 
	 case 1: 
		 System.out.println("please enter number of players : ");
		 int numOfPlayers = input.nextInt();
		 CardsDealer cardsDealer = new CardsDealer(random.toString() , random.toString() , Player[(numOfPlayers)]);
		 cardsDealer.deal();
		 break;
		 
		 
	 case 2:
		 System.out.println("hello , enjoy your  10 grams of drugs .");
		 DrugsDealer drugsDealer = new DrugsDealer(random.toString(), random.toString());
		 drugsDealer.deal();
		 break;
		 
		 
	 case 3:
		 System.out.println("hi , i got 10 toys just for you! ");
		 Santa santa = new Santa();
		 santa.deal();
		 break;
		 
	 }
	
	
	
	}



}



/* casino - a place that all those entities can meet.  
check the class for more information.*/