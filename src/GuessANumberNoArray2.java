
public class GuessANumberNoArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// goal
		int numberToGuess = 49;  // this is what the user is trying to guess
		
		// 
		int userGuess = -1;
		
		// keep track of the number of guesses
		int numberOfGuesses = 0;
		
		
		// start with a range of numbers
		int rangeLowEnd = 1;
		int rangeHighEnd = 100;
		
		System.out.println(String.format("The user should guess a number between"
				+ " %d and %d. \n",rangeLowEnd, rangeHighEnd));
		
		
		// Keep guessing until we guess the number
		
		while(userGuess != numberToGuess) {
			
			// guess the middle of the range
			userGuess = (rangeLowEnd + rangeHighEnd) / 2;  // 101 / 2 = 50
			numberOfGuesses++;
			
			if(userGuess < numberToGuess) {
				
				// cut out everything below the user's guess
				rangeLowEnd = userGuess + 1;
				System.out.println("userGuess of " 
				+ userGuess + " is lower than numberToGuess");

			}
			else if(userGuess > numberToGuess) {
				rangeHighEnd = userGuess - 1;
				System.out.println("userGuess of "
				+ userGuess + " is higher than numberToGuess");

			}
			// user guesses the number:
			else {
				System.out.println("You guessed the number!");
				System.out.println("userGuess is " + userGuess);

			}
			
			System.out.println("- numberOfGuesses is now " + numberOfGuesses);
			System.out.println("- rangeLowEnd is now " + rangeLowEnd);
			System.out.println("- rangeHighEnd is now " + rangeHighEnd);
			
			System.out.println();
			
			
		}  // end while
		
	}  // end main

}
