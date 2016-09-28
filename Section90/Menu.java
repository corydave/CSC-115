import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("What is the age: ");
		int age = scanner.nextInt();

		System.out.print("Steak(S), Trout(T), or Burger(B): ");
		String meal = scanner.nextLine();

		if (age >= 21) {
			if (meal.equals("S")) {
				System.out.print("cabernet");
			} else if (meal.equals("T")) {
				System.out.println("chardonnay");
			} else if (meal.equals("B")) {
				System.out.println("IPA");
			} else {
				System.out.println("invalid choice");
			}
		} else {
			if (meal.equals("S")) {
				System.out.print("vegetable juice");
			} else if (meal.equals("T")) {
				System.out.println("apple juice");
			} else if (meal.equals("B")) {
				System.out.println("soda");
			} else {
				System.out.println("invalid choice");
			}
		}

	}

}
