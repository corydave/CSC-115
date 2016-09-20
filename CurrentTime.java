package dorkingAround;

public class CurrentTime {

	public static void main(String[] args) {

		long numberOfMilliSecondsSinceEPOCH = System.currentTimeMillis();

		long numberOfSecondsSinceEPOCH = numberOfMilliSecondsSinceEPOCH / 1000;

		long numberOfMin = numberOfSecondsSinceEPOCH / 60;

		long numberOfHours = numberOfMin / 60;

		long numberOfDays = numberOfHours / 24;

		long numberOfYears = numberOfDays / 365;

		double numberOfDaysThisYear = numberOfDays % 365.24;

		int numberOfMonths = (int) (Math.round(numberOfDaysThisYear / 30.41666));

		int numberOfDaysThisMonth = (int) (Math
				.round(numberOfDaysThisYear % 30.416667));

		int numberOfHoursToday = ((int) (numberOfHours % 24) - 4);
		// The '-4' accounts for the timezone, since all time
		// is based on GMT

		int numberOfMinutesToday = (int) numberOfMin % 60;

		int numberOfSecondsToday = (int) numberOfSecondsSinceEPOCH % 60;

		// System.out.print("Since the EPOCH, there have been " + numberOfYears
		// + " "
		// + "years, " + numberOfMonths + " months,\n"
		// + numberOfDaysThisMonth + " days, " + numberOfHoursToday
		// + " hours, " + numberOfMinutesToday + " minutes, and "
		// + numberOfSecondsToday + " seconds.");

		System.out.print("\n\n\n\n\n\n\n\n\n" + numberOfYears + " years, "
				+ numberOfMonths + " months,\n" + numberOfDaysThisMonth
				+ " days, " + numberOfHoursToday + ":");

		if (numberOfMinutesToday < 10) {
			System.out.print("0" + numberOfMinutesToday);
		} else {
			System.out.print(numberOfMinutesToday);
		}

		System.out.print(":");

		if (numberOfSecondsToday < 10) {
			System.out.print("0" + numberOfSecondsToday);
		} else {
			System.out.print(numberOfSecondsToday);
		}

		// + numberOfMinutesToday + ":"
		// + numberOfSecondsToday + "\n" );

	}
}
