
public class ClientRotateArrayInN1SpaceComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// Chaz Wall
		int[] numbers = {1,2,3,4,5};
		int pivot = 2;
		int temp = numbers[pivot];
		
		//int[] numbersRotated = new int[numbers.length];
		
		
		// 1. First way - create a separate array
		for(int i = 0, j = pivot, k = pivot + pivot;
				i < numbers.length;
				i++,j++,k++) {
			
			
			if(j < numbers.length && k < numbers.length) {
				
				System.out.println("IF");
				temp = numbers[j];  // temp is 3
				numbers[j] = numbers[i]; // 1 2 1 4 5, temp 3
				
				numbers[i] = numbers[j + 1];
				numbers[k] = temp;  // 1 2 1 4 3, temp 
				temp = numbers[k];  //
				
				// temp = numbers[i];  // >>
				
			}
			else if(j < numbers.length && k >= numbers.length) {
				
				k = k % numbers.length;  // flip back
				
				System.out.println("ELSE IF");
				
				temp = numbers[j];
				numbers[j] = numbers[i];
				
				numbers[k] = temp;
				temp = numbers[k];
			}
			else {
				System.out.println("ELSE IF");
				j = j % numbers.length;  // flip back
				
				temp = numbers[j];
				numbers[j] = numbers[i];
				
				numbers[k] = temp;
				temp = numbers[k];
			}
				

			System.out.println(" - i is now " + i);
			System.out.println(" - j is now " + j);
			System.out.println(" - k is now " + k);
			
			display(numbers);
			
		}
		
	}

	public static void display(int[] numbers) {
		// Display
		for(int number : numbers) {
			System.out.println(" - Number is: " + number);
		}
		
	}
	
}
