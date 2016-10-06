import java.util.Scanner;

public class FindFutureDates {
	public static void main (String args[]) {

		int todaysNumber;
		int daysFromToday;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter today's day:");
		todaysNumber = scanner.nextInt();
		
		System.out.print("Enter the number of days elapsed since today:");
		daysFromToday = scanner.nextInt();
		
		String todayName = "";
		
		switch(todaysNumber) {
		
			case 0:
				todayName = "Sunday";
				break;
			case 1:
				todayName = "Monday";
				break;		
			case 2:
				todayName = "Tuesday";
				break;			
			case 3:
				todayName = "Wednesday";
				break;
			case 4:
				todayName = "Thursday";
				break;		
			case 5:
				todayName = "Friday";
				break;			
			case 6:
				todayName = "Saturday";
				break;
			default: 
				todayName = " an invalid starting day. Today's day must be 0-6.";
				break;
		}
		
		
		int futureDayNumber = todaysNumber + daysFromToday;
		futureDayNumber = futureDayNumber % 7;
		
		String futureDayName = "";
				
		switch(futureDayNumber) {
		
			case 0:
				futureDayName = "Sunday";
				break;
			case 1:
				futureDayName = "Monday";
				break;		
			case 2:
				futureDayName = "Tuesday";
				break;			
			case 3:
				futureDayName = "Wednesday";
				break;
			case 4:
				futureDayName = "Thursday";
				break;		
			case 5:
				futureDayName = "Friday";
				break;			
			case 6:
				futureDayName = "Saturday";
				break;
			default: 
				futureDayName = " an invalid ending day. Today's day must be 0-6.";
				break;
		}		
		
		System.out.println("Today is " + todayName + " and the future day is " + futureDayName);
	
	}
}












