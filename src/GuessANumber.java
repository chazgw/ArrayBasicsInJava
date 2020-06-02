
public class GuessANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		int[] myArray = {1,2,3,4,5,6};
		
		// goal
		int numberToFind = 3;  // can vary
		
		// overall flag for a found number
		boolean numberFound = false;
		
		// Keep track of where we are
		int currentIndex;

		// Keep track of the range
		// Adjust accordingly on each loop pass;
		// Divide by roughly 2 on each pass
		
		// On the first pass, set the lower end of the range
		// to 0
		int lowerBounds = 0;
		int upperBounds = myArray.length - 1;
		
		int numberOfPasses = 0;
		
		
		// Search!
		//while(numberFound == false) {
		while(numberFound == false && lowerBounds <= upperBounds) {
			
			
			// Debug
			System.out.println("lower bounds is now: " + lowerBounds);
			System.out.println("upper bounds is now: " + upperBounds);
			
			// first pass
			// start in the "middle"				
			currentIndex = (lowerBounds + upperBounds) / 2;
			// On first pass, this is 0 + 5
			// Second Pass: (3 + 5) / 2 = 4 
			 
			// if number is found, exit:
			if(numberToFind == myArray[currentIndex]) {
				System.out.println("number found!");
				numberFound = true;

			}
			// if not, test for value
			// (this is the case for the first pass)
			else if(numberToFind > myArray[currentIndex]) {
				// look at the upper range
				
				// set the new range
				lowerBounds = currentIndex + 1;  // now lower index is 4; was 3
				
			}
			else if(numberToFind < myArray[currentIndex]) {
				// look at the lower range
				upperBounds = currentIndex - 1;
				
			}
			
			numberOfPasses++;
			
			// Debug
			
			System.out.println("numberOfPasses is now: " + numberOfPasses);

			
		}  // end loop
		
		// Did we find it?
		System.out.println("number found?  " + numberFound);
			


		
		
		/*
		int userGuess = 50;
		int targetValue = 74;  // this is what the user is trying to guess
		
		// start with a range of numbers
		int rangeLowEnd = 1;
		int rangeHighEnd = 100;
		
		
		// As long as the user hasn't made a correct guess,
		// tell them if the target value is higher or lower
		// and let them guess again
		
		// Logically, the first guess by the user should start in the
		// "middle"
		
		System.out.println("The user should guess a number between"
				+ " 1 and 100.");
		
		
		// Keep guessing until the user guess is the same as the target
		while(userGuess != targetValue) {
			
			// keep guessing!
			// if the user guess is higher than the target
			if(userGuess > targetValue) {
				
				// re-guess:
				// userGuess = userGuess / 2;
				
				// cut the range in half:
				rangeHighEnd = rangeHighEnd / 2;
				
				System.out.println(String.format("user guess %d was higher than "
						+ " target of %d ",userGuess,targetValue));
				
			}
			// if the user guess is lower than the target
			else if(userGuess < targetValue){
				// guess higher
				rangeLowEnd = userGuess + 1;
				System.out.println(String.format("user guess %d was lower than "
						+ " target of %d ",userGuess,targetValue));
			}
			else {
				System.out.println("You guessed the number!");
			}
			
			
		}
		
		
		*/
	}

}
