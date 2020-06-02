public class GuessANumberWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = {0,1,2,3,4,5};
		//int[] myArray = {11,22,33,44,55,66};
		
		// goal
		int numberToFind = 5;  // can vary
		int userGuess = -1;
		
		// overall flag for a found number
		boolean numberFound = false;
		
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
			
			// first pass - start in the "middle"				
			userGuess = (lowerBounds + upperBounds) / 2;
			System.out.println("\n- userGuess is now: " + userGuess);

			// On first pass, this is 0 + 5
			// Second Pass: (3 + 5) / 2 = 4 
			 
			// if number is found, exit:
			if(numberToFind == myArray[userGuess]) {
				System.out.println("number found!");
				numberFound = true;

			}
			// if not, test for value
			// (this is the case for the first pass)
			else if(userGuess > numberToFind) {
				// look at the upper range
				
				// set the new range higher
				// lower bounds is one higher than the user's previous guess
				upperBounds = userGuess - 1;  // now lower index is 4; was 3
				System.out.println("Guess is greater than numberToFind");
			}
			else if(userGuess < numberToFind) {
				
				// set the new range lower
				// upper bounds is one higher than the user's previous guess
				lowerBounds = userGuess + 1;
				System.out.println("Guess is less than numberToFind");

				
			}
			
			numberOfPasses++;
			
			// Debug
			//System.out.println("numberOfPasses is now: " + numberOfPasses);

			
		}  // end loop
		
		// Did we find it?
		System.out.println("number found?  " + numberFound);
			
	}

}
