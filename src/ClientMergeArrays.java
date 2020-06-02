
public class ClientMergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayA = {23, 47, 81, 95};
		int[] arrayB = {7, 14, 39, 55, 62, 74};
		
		int[] arrayC = merge(arrayA, arrayB);
		
		printArray(arrayC);
		
	}


	public static int[] merge(int[] array1, int[] array2) {
		
		// Note: This assumes that both arrays passed in are
		// already sorted.
		
		int[] mergedArray = new int[array1.length + array2.length];
		System.out.println("mergedArray.length: " + mergedArray.length);
		
		
		boolean array1Full = false;  // if you are at the end of the array
		boolean array2Full = false;
		
		// based on https://www.geeksforgeeks.org/java-program-for-merge-sort/
		
		int i = 0;  // counter for new merged array
		int k = 0;  // counter for first array
		int j = 0;  // counter for second array
		
		while (j < array1.length && k < array2.length) {
			
			if(array1[j] <= array2[k]) {
				mergedArray[i] = array1[j];
				j++;  // increase array1 counter
			}
			else if(array1[j] > array2[k]) {
				mergedArray[i] = array2[k];
				k++;  // increase array2 counter
			}
			
			System.out.println(String.format("mergedArray[%d] is: [%d] ",i, mergedArray[i]));
			i++; // increase new merged array counter
			
		}
		
		
		// If we hit the end of one of the arrays,
		System.out.println(String.format("ending one of the arrays; j is %d and k is %d",j,k));
		
		// fill out the rest of the array with the remaining
		// elements of the other array:
		while (j < array1.length) {
			System.out.println("In second while loop:");
			mergedArray[i] = array1[j];
			System.out.println(String.format("mergedArray[%d] is: [%d] ",i, mergedArray[i]));
			j++;  // second array counter
			i++;  // merged array counter
		}
		
		System.out.println(String.format("after j is full, j is: %d ",j));
		
		while (k < array2.length) {
			System.out.println("In second while loop:");
			mergedArray[i] = array2[k];
			System.out.println(String.format("mergedArray[%d] is: [%d] ",i, mergedArray[i]));
			j++;
			i++;
		}
			
		return mergedArray;
		
	} // end merge()

	
	public static void printArray(int[] myArray) {
		
		for(int i = 0; i< myArray.length; i++) {
			System.out.println("myArray["+i+"] :" + myArray[i]);
		}
		
	}
}
