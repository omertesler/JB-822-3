package johnbrice;
import java.util.Scanner;
public class clock2 {
	public static void main(String[] args) {
		
		 
	}
	
	private int hh;
	private int mn;
	private int sc;
	private int ms;
	
	public clock2(int hh, int mn, int sc, int ms) {
		
	        this.hh = hh;
			this.mn= mn;
			this.sc = sc;
			this.ms = ms;
		}
	
	public void clockDefualt(int hh, int mm, int sc, int ms) {
	
		hh = 14;
		mn = 07;
		sc = 53;
		ms = 980;
	}
	public static void addHours(int hh) {
		
		if (hh >= 0 && hh < 1_000_000) {
			
			System.out.print(hh + ":");
		}
				}
		public static void  addMin(int mm) {
			if (mm >= 0 && mm < 1_000_000) {
				System.out.print(mm + ":");
				
			}
				}
		public static void addSec(int sc) {
			if (sc >= 0 && sc < 1_000_000) {
				System.out.print(sc + ":");
			}
			
		}
		public static void addMs(int ms) {
			if (ms >= 0 && ms < 1_000_000) {
				System.out.print(ms);		
			}
		}
		
		public  void print() {
			
			Scanner input = new Scanner(System.in);
			String clock_type = input.next();
			
			System.out.println("do you want to calculate per am/pm ? " );//
			clock_type = input.next();
			
			if(clock_type == "no" || clock_type == "No") {  
			 // it means that this is regular clock.
				System.out.println("please enter amout of time : ");
				
		
				
					
				System.out.println("please enter miliseconds : ");
				int miliseconds = input.nextInt();
				
				
				System.out.println("please enter seconds : ");
				int seconds = input.nextInt();
				
				
				System.out.println("please enter minutes : ");
				int minutes = input.nextInt();
				
				
				System.out.println("please enter hours : ");
				int hours = input.nextInt();
				
				
			
				//now we calculate the amount of time we got from the user with the Default time (clcokDefault)
				
				int mshelper = (ms + miliseconds )  / 1_000_000; //calculate how many seconds we need to add to the seconds value.
				int mshelper2 = (ms + miliseconds )  % 1_000_000;//calculate how many miliseconds we need to add to the miliseconds value.
				ms = mshelper2; // we got the miliseocnds after the sum.
				seconds = seconds + mshelper; // we sum the seconds we got from mshelper. it will help in calculating the seconds.(lines88-89)
				
				int schelper = (sc + seconds )  / 1_000_000;
				int schelper2 = (sc + seconds )  % 1_000_000;
				sc = schelper2; 
				minutes = minutes + schelper; 
				
				int mnhelper = (mn + minutes )  / 1_000_000;
				int mnhelper2 = (mn + minutes )  % 1_000_000;
				mn = mnhelper2; 
				hours = hours + mnhelper; 
				
				 // we dont need to divide because we dont transfer hours to days. and also if we get more then milion hours like in the reaity we start from the begnning of the hours.
				int hhhelper = (hh + hours )  % 1_000_000;
				
				
				
				
			}
			
			
			
			
				
				System.out.println(hh+":"+mn+":"+sc+":"+ms +"AM/PM");
				
				
			



}

}

