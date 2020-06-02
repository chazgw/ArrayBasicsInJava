
public class ClientInsertValueIntoLowLevelArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a "low-level" array
		LowLevelArray myLowLevelArray = new LowLevelArray(5);
		
		// Add elements to the array:
		// myLowLevelArray[0] = 99;  // we can't do this because myLowLevelArray
			// doesn't represent just the array itself; it is a wrapper class
		
		// Use the wrapper method instead
		myLowLevelArray.insertValue(22);
		myLowLevelArray.insertValue(33);
		myLowLevelArray.insertValue(88);
		myLowLevelArray.insertValue(66);
		myLowLevelArray.insertValue(55);
		// The last one won't be inserted:
		myLowLevelArray.insertValue(99);
		
		
		
	
	}

}
