import java.util.Scanner;

public class FindFutureDates {
	public static void main (String args[]) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter today's day:");
		int todaysDay = scanner.nextInt();
		
		System.out.print("Enter the number of days elapsed since today:");
		int numOfDays = scanner.nextInt();
		
		String firstDay = "";
		String lastDay = "";
		
		switch (todaysDay) {
			case 0: 
				firstDay = "Sunday";
				break;
			case 1:
				firstDay = "Monday";
				break;
			case 2:
				firstDay = "Tuesday";
				break;
			case 3:
				firstDay = "Wednesday";
				break;
			case 4:
				firstDay = "Thursday";
				break;
			case 5:
				firstDay = "Friday";
				break;		
			case 6:
				firstDay = "Saturday";
				break;			
			default:
				firstDay = " an invalid starting day. Today's day must be 0-6.";
				break;			
		}
		
		int tempDay = (todaysDay + numOfDays) % 7;
		
		switch (tempDay) {
			case 0: 
				lastDay = "Sunday";
				break;
			case 1:
				lastDay = "Monday";
				break;
			case 2:
				lastDay = "Tuesday";
				break;
			case 3:
				lastDay = "Wednesday";
				break;
			case 4:
				lastDay = "Thursday";
				break;
			case 5:
				lastDay = "Friday";
				break;		
			case 6:
				lastDay = "Saturday";
				break;			
			default:
				lastDay = "INVALID";
				break;			
		}		
		
		
		System.out.print("Today is " + firstDay + " and the future day is " + lastDay);
	
	}
}
