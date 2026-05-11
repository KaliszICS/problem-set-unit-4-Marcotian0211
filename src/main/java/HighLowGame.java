import java.util.Scanner;
import java.util.Random;

public class HighLowGame {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		// game title.
		System.out.println("Welcome to the High Low Guessing Game.\n");
		System.out.print("Input a number of rounds to plays:");
		// get number that game round times.
		int roundNumber = scanner.nextInt();
		// prevent the game round times that user input number lower than 1;
		while (roundNumber < 1) {
			System.out.println("\nInvalid Input!");
			// clear error input.
			scanner.nextLine();
			// get new game round times.
			System.out.print("Input a number of rounds to plays:");
			roundNumber = scanner.nextInt();
		}
		// declear variable call "count" to get score of game.
		int count = 0;
		// rule the loop times of game.
		for (int z = 1; z <= roundNumber; z++) {
			System.out.println("\nround " + z + ":\n");
			// some selection of game.
			System.out.println("Please select High, Low or Even:");
			System.out.println("1. High (11 to 20)");
			System.out.println("2. Low (0 to 9)");
			System.out.println("3. Even(10)\n");
			int number = scanner.nextInt();
			// get random number(0-20)
			int randomNumber = random.nextInt(21);
			// use boolean variable call win to clearly get count should +1 or not.
			boolean win = false;
			// follow selection 1
			if (number == 1 && randomNumber >= 11 && randomNumber <= 20) {
				win = true;
			}
			// follow selection 2
			if (number == 2 && randomNumber >= 0 && randomNumber <= 9) {
				win = true;
			}
			// follow selection 3
			if (number == 3 && randomNumber == 10) {
				win = true;
			}
			// prevent the user to input error selection.
			while (number > 3 || number < 1) {
				// declear error input.
				scanner.nextLine();
				System.out.println("\nInvalid Input!");
				System.out.println("Please select High, Low or Even:");
				System.out.println("1. High (11 to 20)");
				System.out.println("2. Low (0 to 9)");
				System.out.println("3. Even(10)\n");
				// get new input selection number.
				number = scanner.nextInt();
				// to test new input number get score or not.
				if (number == 1 && randomNumber >= 11 && randomNumber <= 20) {
					win = true;
				}
				if (number == 2 && randomNumber >= 0 && randomNumber <= 9) {
					win = true;
				}
				if (number == 3 && randomNumber == 10) {
					win = true;
				}
			}
			// if boolean type change to true
			if (win == true) {
				// score +1;
				count++;
				System.out.println("\nThe number was " + randomNumber + ". You were correct.");
			}

			else {
				System.out.println("\nThe number was " + randomNumber + ". You were incorrect.");
			}

			System.out.println("Current Score: " + count + "\n");
		}
		// print final score
		System.out.println("Total Score: " + count);
		// if user get more than zero score,this will print.
		if (count > 0) {
			System.out.print("Congratulations you got" + " " + count + " out of " + roundNumber + " rounds right!");
		}
		// if user get zero score,this will print
		else {
			System.out.print(
					"you got" + " " + count + " out of " + roundNumber + " correct. " + " Better Luck next time.");
		}
	}
}