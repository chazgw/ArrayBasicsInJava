
public class ClientFillNewArrayReversedElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {1,2,3,4,5};
		
		int[] reversedArray = new int[numbers.length];
		
		
		for(int i = 0, j = numbers.length - 1; i < numbers.length; i++, j--) {
			reversedArray[i] = numbers[j];
			
		}
		
		// Display
		for(int number : reversedArray) {
		// equivalent to for(int number = 0; number < reversedArray.length; number++)
			System.out.println("number is: " + number);
		}
		
	}

}
