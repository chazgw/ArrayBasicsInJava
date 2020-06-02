
public class GuessANumberWithArray2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int[] myArray = {11,22,33,44,55,66,77};  // make sure this is ordered
		//int[] myArray = {11}; 
		
		
		
		int numberToGuess = 5;  // goal number
		
		
		// to start...
		int elementAtUserGuess = -1;
		int userGuessIndex = -1;
		int rangeLowEnd = 0;
		int rangeHighEnd = myArray.length - 1;
		
		// for debugging:
		int numberOfPasses = 0;
		
		
		// keep track of the number of guesses
		int numberOfGuesses = 0;
		
		// have we found the number?
		boolean numberFound = false;
		
		// have we hit the end of the range?
		boolean endOfRange = false;
		
		
		
		// keep guessing until we either find the number,
		// or we've narrowed the range to one element, and we haven't
		// found the number.
		
		//while(elementAtUserGuess != numberToGuess && numberFound == false) {
		// same as
		while(numberOfGuesses < 5 && elementAtUserGuess != numberToGuess && !numberFound
				&& !endOfRange) {	
			
			// start in the middle of the array
			userGuessIndex = (rangeLowEnd + rangeHighEnd) / 2;  // for 6 elements,
			    // this will be 2
			
			// for debugging:
			numberOfGuesses++;
			
			//
			elementAtUserGuess = myArray[userGuessIndex];  // to start, this will be
				// 44 with the elements in the array
			

			
			// did we find the number?
			if(numberToGuess == elementAtUserGuess) {
				
				System.out.println("Number found! " + numberToGuess);
				
				//break;
				
			}
			// if guess is higher than element we are "looking at"
			else if(numberToGuess < myArray[userGuessIndex]) {
				
				System.out.println("guess is too high...searching lower");
				
				System.out.println(" - rangeLowEnd: " + rangeLowEnd
						+ " rangeHighEnd: " + rangeHighEnd);
				
				// if number isn't found
				if(rangeHighEnd <= rangeLowEnd) {
					
					endOfRange = true;
					System.out.println("Number not found.");
				}
				
				// cut out the top range:
				rangeHighEnd = userGuessIndex - 1;  // now the range is indexes
					// 0 through 2
				
			}
			else if(numberToGuess > myArray[userGuessIndex]) {
				
				// if number isn't found
				if(rangeLowEnd == rangeHighEnd) {
					
					endOfRange = true;
					System.out.println("Number not found.");
					
				}
				
				System.out.println("guess is too low...searching higher");
				
				rangeLowEnd = userGuessIndex + 1;
			}
			
	
		}  // end while
		
		// we've looped through
	
		
	}

}
