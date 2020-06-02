
public class ClientRotateArraySwapFrontAndBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// This code creates a separate, blank array,
		// then fills in each element with two subarrays,
		// named here as rightArray and leftArray.
		
		// int[] numbers = {1,2,3,4,5,6};
		int[] numbers = {3,6,9,12,15,18};
		int pivot = 2;  // shift all elements by this number
		int[] rotatedArray = new int[numbers.length];
		
		int[] rightArray = new int[numbers.length - pivot];  // size of 4
		int[] leftArray = new int[pivot]; // size of 2
		
		
		// leftArray will be a size of 2, and be
		// debug:
		System.out.println("leftArray.length: " + leftArray.length);
		System.out.println("rightArray.length: " + rightArray.length);
		
		
		// fill new left array
		for(int i = 0, j = numbers.length - pivot; i < pivot; i++,j++) {
			
			System.out.println(String.format("i is %d and pivot is %d", i, pivot));
			
			leftArray[i] = numbers[j];
			//System.out.println("leftarray[" + i + "] is " + leftArray[i]);

		}
			
		
		// fill new right array
		// if pivot is 2, fill 4 spaces
		for(int i = 0, j = pivot; i < rightArray.length; i++,j++) {
			rightArray[i] = numbers[i];
			System.out.println("rightArray["+i+"]: " + rightArray[i]);
		}
		
			
		
		// 2 Merges
		
		// first:
		for(int i = 0; i < leftArray.length; i++) {
			
			rotatedArray[i] = leftArray[i];
			
		}
		
		// second:
		for(int i = pivot, j = 0; j < rightArray.length; i++,j++) {
			
			rotatedArray[i] = rightArray[j];
			
		}
		
		// Display
		
		for(int number : rotatedArray) {
			System.out.println("Number is: " + number);
		}
		
	}
	
}
