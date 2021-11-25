import java.util.Random;
import java.util.Scanner; 
/**
 * 
 */

/**
 * @author gamuc
 *
 */
public class guessGame {
	//fields
	public int userGuess, score, guessCounter, guessLimit;
	public int maxRange, minRange,num;
	public boolean play;
	public String option;
	//instantiate the Random and Scanner class
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	//constructor
	public guessGame(int minR, int maxR) {
		//give all fields initial values
		maxRange = maxR;
		minRange = minR; 
		score = 0;
		option = " ";
		guessCounter = 0;
		guessLimit = 5;
		userGuess = 0; 
		play = true;
	}
	//method for playing the game
	public void playGame() {
		while (play) {
			num = (int)(Math.random() * (maxRange - minRange)) + minRange;
			/*execute for loop until the user
			 * has exhausted their tries
			 */
			for (int a = 0; a < 5; a++) {
				//take in user guess
				System.out.print("Enter your guess: ");
				userGuess = scan.nextInt();
				
				if (num == userGuess) {
					System.out.println("Congratulations! You guessed"
							+ " correctly");
					//increment score
					score++;
					System.out.println("The random number was  " + num);
					System.out.println("Your score = " + score);
					break;
				}
				else if (num > userGuess) {
					System.out.println("Your guess is too low!");	
				}
				else if (num < userGuess) {
					System.out.println("Your guess is too high!");
				}
				//decrement guessLimit and guessCounter 
				guessLimit--;
				guessCounter++;
			}
			
			if (guessLimit == 0) {
				System.out.println("You have no more tries.");
				System.out.println("The random number was  " + num);
				System.out.println("Your score = " + score);
			}
			break;
		}
	}
	//method for playing the game again
	public void playAgain() {
		//ask user if they would like to play again
		if (guessLimit == 0 || userGuess == num ) {
			System.out.print("\nDo you wish to play again? Y/N");
			option = scan.next();
			/*returns true when the user enters y/Y
			 * and returns false when the user enters n/N
			 */
			boolean again = option.equalsIgnoreCase("y");
			/*If the user wants to play again
			 * call the main method and playGame method
			 */
			if (again == true) {
				Project2.main(null);
				playGame();
			}
			/* Else, see you later bruv.
			 * 
			 */
			else {
				System.out.println("See you next time :)");
			}
		}
	}
}
