
public class ClientRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {3,6,9,12,15,18};
		
		int pivot = 7;  // the algorithm in the for loop below would reset
						// this to 1
						// only works with numbers 0 or greater

		int[] numbersRotated = new int[numbers.length];
		
		
		for(int i = 0, j = Math.abs(pivot % numbers.length); i < numbers.length; i++,j++) {
			
			if(j < numbers.length) {
				numbersRotated[j] = numbers[i];
			}
			
			if(j == numbers.length) {

				j = 0;
				// Note: In class on Monday April 20, I didn't have
				// the following, which kept the first element
				numbersRotated[j] = numbers[i];
			}
			
		}
		
		// Display
		for(int number : numbersRotated) {
			System.out.println("Number is: " + number);
		}
		
	}  // end main

}
