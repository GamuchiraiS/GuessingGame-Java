import java.util.Scanner;

public class Project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate Scanner class
		Scanner can = new Scanner(System.in);
		//variables
		int maxRange, minRange;
		System.out.println("Welcome to The Guessing Game! \nYou have a total of 5 tries"
				+ " to guess the computer generated number. Best of luck!");
		System.out.print("Please enter a minimum value for the range: ");
		minRange = can.nextInt();
		System.out.print("Please enter a minimum value for the range: ");
		maxRange = can.nextInt();
		guessGame gg = new guessGame(maxRange, minRange);
		gg.playGame();
		gg.playAgain();
		can.close(); //close Scanner
	}

}
