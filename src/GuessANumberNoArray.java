
public class GuessANumberNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int userGuess = 50;
		int targetValue = 74;  // this is what the user is trying to guess
		
		// start with a range of numbers
		int rangeLowEnd = 1;
		int rangeHighEnd = 100;
		int numberOfElements = 100;
		
		
		
		// As long as the user hasn't made a correct guess,
		// tell them if the target value is higher or lower
		// and let them guess again
		
		// Logically, the first guess by the user should start in the
		// "middle"
		
		System.out.println(String.format("The user should guess a number between"
				+ " 1 and %d. \n",numberOfElements));
		
		int loopTerminalCount = 0;
		
		// Keep guessing until the user guess is the same as the target
		while(userGuess != targetValue && loopTerminalCount < 8) {
			
			loopTerminalCount++;
			
			// keep guessing!
			// if the user guess is higher than the target
			if(userGuess > targetValue) {
				
				// re-guess:
				// userGuess = userGuess / 2;
				
				
				
				System.out.println(String.format("user guess %d was higher than "
						+ " target of %d ",userGuess,targetValue));
				
				// eliminate the low high end of the range
				// rangeHighEnd = rangeHighEnd / 2;
				rangeHighEnd  = userGuess - 1;
				
				// new user guess
				userGuess = (rangeLowEnd + rangeHighEnd) / 2;
				
				System.out.println(" - new > userGuess: " + userGuess);
				
				System.out.println("...");
				
			}
			// if the user guess is lower than the target
			else if(userGuess < targetValue){
				
				
				System.out.println(String.format("user guess %d was lower than "
						+ " target of %d ",userGuess,targetValue));
				
				// eliminate the low high end of the range
				rangeLowEnd = userGuess + 1;
				
				// guess higher
				userGuess = (rangeLowEnd + rangeHighEnd) / 2;
				
				System.out.println(" - new < userGuess: " + userGuess);

				
				System.out.println("...");
				
			}
			else {
				System.out.println("You guessed the number!");
			}
			
			System.out.println(String.format(" After loop, rangeLowEnd is %d "
					+ "and rangeHighEnd is %d", rangeLowEnd, rangeHighEnd));

		}
		
		
		
		
	}

}
