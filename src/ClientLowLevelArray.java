
public class ClientLowLevelArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a "low-level" array
		LowLevelArray myLowLevelArray = new LowLevelArray(5);
		
		// Add elements to the array:
		// myLowLevelArray[0] = 99;  // we can't do this because myLowLevelArray
			// doesn't represent just the array itself; it is a wrapper class
		
		// Use the wrapper method instead
		myLowLevelArray.setElement(0, 22);
		myLowLevelArray.setElement(1, 100);
		myLowLevelArray.setElement(2, 87);
		myLowLevelArray.setElement(3, 65);
		myLowLevelArray.setElement(4, 17);
		
		// Manually setting the number of elements - don't leave it in this state!
		myLowLevelArray.numberOfElements = 5;
		
		
		// Delete a value
		//myLowLevelArray.deleteValue(87);  // index 2
		
		
		// Output all of the array elements:
		myLowLevelArray.displayElements();
		
		// Display whatever is at element 3 (index 2):
		System.out.println("myLowLevelArray.getElement(2): " 
				+ myLowLevelArray.getElement(2));
		
		
		// find and remove max:
		int previousMax = myLowLevelArray.removeMax();
		
		// Output all of the array elements:
		System.out.println("after myLowLevelArray.removeMax(): " + previousMax);
		
		myLowLevelArray.displayElements();
		
		
		
		
		/*
		// Breaking it:
		myLowLevelArray.setElement(8, 123);
		*/

		
		
	}

}
