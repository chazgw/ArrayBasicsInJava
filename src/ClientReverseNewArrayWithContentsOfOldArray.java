
public class ClientReverseNewArrayWithContentsOfOldArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] numbers = {1,2,3,4,5};
		
		// int[] reversedArray = new int[5];
		int[] reversedArray = new int[numbers.length];  // based on size of other array
		
			
		// Multiple LCVs!
		for(int i = 0, j = numbers.length - 1; i < numbers.length; i++, j--) {
			
			reversedArray[i] = numbers[j];
			
		}

		// Loop through reversedArray and output
		for(int i = 0; i < reversedArray.length ; i++) {
			
			System.out.println(String.format("reversedArray[%d]: %d", i, reversedArray[i]));
		}
		
		
	}  // end main()

	
	
}
