package johnbrice;
import java.util.Scanner;
import java.lang.Math;

public class sukutwork {





	/**
	 * Write a program that will compute some statistics about students grades.
	 * It will ask the user to enter the number of students.
	 * Then, the program will ask the user to enter the grades one by one.
	 * The range of each grade is an integer between 0 and 100.
	 * Make sure to use an array where the type is the closest to this range (hint: don't use an array of "int"'s).
	 * If the user enters a number which is not in range, the program will ask him to enter a new grade.
	 * Once the user entered all the grades, the program will print:
	 * 1. The highest grade and its index (something like: the student #10 got the highest grade and it's 98).
	 * 2. The lowest grade and its index (something like: the student #3 got the lowest grade and it's 13).
	 * 3. The average of the grades
	 */


	public static void main(String[] args) {
grades1();
	}


	public static void grades1() {

		Scanner input = new Scanner(System.in);  

		System.out.println("Enter number of students: " );

		int numberOfStudents = input.nextInt(); 

		System.out.println("Number entered: " + numberOfStudents);

		int[] grades = new int[numberOfStudents];

		//insert grades number.
		int max = 0;
		int min = 100;
		double avg;
		int sum = 0;
		for(int i = 0; i<numberOfStudents; i++) {
			System.out.println("enter grade number : " + i);
			grades[i] = input.nextInt();
			
		
						
			if(max < grades[i]) {
				max = grades[i];
			}

			if(min > grades [i]) { // min = 100 in the beginning. if the next grade is lower then 100 , min = grade, and so keep going.
				min = grades[i];
			}

			sum = sum + grades[i]; // every time it sums the next grade.


		}
		avg = sum / grades.length; // or i could use sum / numberOfStudents ; 
		
System.out.println("max : " + max);
System.out.println("min : " + min);
System.out.println("averege; " + avg);
		input.close();
	}  

	
}







