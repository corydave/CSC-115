
public class Clock {

	public static void main(String[] args) {

		// 1474410092051
		// 1474410100501
			
		long milliSecondsSinceEpoch = System.currentTimeMillis();
		
		long secondsSinceEpoch = milliSecondsSinceEpoch / 1000;
		
		long minutesSinceEpoch = secondsSinceEpoch / 60;
		
		long hoursSinceEpoch = minutesSinceEpoch / 60;
		
		long daysSinceEpoch = hoursSinceEpoch / 24;
		
		double yearsSinceEpoch = daysSinceEpoch / 365.24;
	
		int daysThisYear = (int)(Math.round(daysSinceEpoch % 365.24));
				
		int monthsThisYear = (int)(Math.round(daysThisYear / 30.42));
		
		int daysThisMonth = (int)(Math.round(daysThisYear % 30.42));
		
		long hoursThisDay = hoursSinceEpoch % 24 - 4;
		// Subtract 4 because we are in EST and currentMilliSeconds()
		// is according to GMT
		
		long minutesThisDay = minutesSinceEpoch % 60;
		
		long secondsThisDay = secondsSinceEpoch % 60;
		
		System.out.println("Since the EPOCH, there have been " + (int)yearsSinceEpoch + " years.");
		System.out.println("There have been " + monthsThisYear + " months.");
		System.out.println("There have been " + daysThisMonth + " days.");
		System.out.println("There have been " + hoursThisDay + " hours.");
		System.out.println("There have been " + minutesThisDay + " minutes.");
		System.out.println("There have been " + secondsThisDay + " seconds.");		
		
		
		
		
		
		

	}

}
