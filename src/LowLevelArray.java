
public class LowLevelArray {

	// Data Members
	// the array itself:
	private long lowLevelArray[];  // just the declaration;
		// we need to instantiate this somewhere
	private int size;  // the number of elements in the array
	
	public int numberOfElements;
	
	
	// Constructor(s)
	public LowLevelArray(int size) {
		lowLevelArray = new long[size];  // instantiation goes here
		this.size = size;
		// we could set the number of elements here
		numberOfElements = 0;
	}
	
	
	// Getter / Setter methods
	
	// to use this, we need both the index and the data value
	public void setElement(int index, long value) {
		
		lowLevelArray[index] = value;
		
	}
	
	public long getElement(int index) {
		
		return lowLevelArray[index];
	}

	
	
	// Other methods
	
	// Insert
	public void insertValue(int value) {
		
		// We don't want to go out of the bounds of the array,
		// so we only allow inserts if we aren't at the end:
		
		if(numberOfElements < size) {
		// OR if(numberOfElements < lowLevelArray.length ) {
			lowLevelArray[numberOfElements] = value;
			// increment the numberOfElements so that
			// the value is ready for the next insertion
			numberOfElements++;
		}
		else {
			System.out.println("Can't add any more items.");
		}
		
	}
	
	
	
	// Delete
	public void deleteValue(long lowLevelArray2) {
		
		// loop through and find (use the number of elements as the loop control
		// variable
		for(int i = 0; i < numberOfElements; i++) {
			
			// if we find the element
			if(lowLevelArray2 == lowLevelArray[i]) {
				
				// "delete" (overwrite and shift)
				for(int j = i; j < numberOfElements; j++) {
					
					
					// Take the next highest element and overwrite
					// (only assign if we are not out of bounds!)
					if(j + 1 < numberOfElements) {
						lowLevelArray[j] = lowLevelArray[j + 1];
					}
					else {
						// don't assign the element
					}
					
				}
				
				// reduce the number of elements (leave the last element "hanging");
				// (you can use any of these three:
				// 1. numberOfElements = numberOfElements - 1;
				// 2. numberOfElements -= 1;
				// 3.
				numberOfElements--;  // take one away
				
			}  // end if(value == lowLevelArray[i]) {
			
		}
		
	}  // end deleteValue
	
	public int findMaxIndex() {
		
		long maxValue = -1;
		int maxIndex = -1;
		
		// take the first value and index regardless
		if(numberOfElements > 0) {
			
			// if we have an array with elements, here's the 
			// initial setup
			maxIndex = 0;
			maxValue = lowLevelArray[0];
			
			for(int i = 1; i < numberOfElements; i++) {
				
				if(lowLevelArray[i] > maxValue) {
					// shift elements
					maxIndex = i;
					maxValue = lowLevelArray[i];

				}
				
			} // end for
			
		}
		
		return maxIndex;
	}
	
	
	
	
	public int removeMax() {
		
		// this will return the index of the highest value.
		
		// findMax()
		// deleteValue()

		long maxValue = -1;
		int maxIndex = 0;
		
		// take the first value and index regardless
		if(numberOfElements > 0) {
			maxIndex = 0;
			maxValue = lowLevelArray[0];
		}
		
		
		// Two function calls:
		maxIndex = findMaxIndex();
		deleteValue(lowLevelArray[maxIndex]);
		
		return maxIndex;
		
	}  // end removeMax()
	
	
	//public void deleteAtIndex
	
	
	public void displayElements() {
		
		// Loop through
		for(int i = 0; i < numberOfElements; i++) {
			//System.out.println("lowLevelArray[" + i + "]: " + lowLevelArray[i]);
			
			// Using a String Format
			System.out.println(String.format("lowLevelArray[%d]: %d", i, lowLevelArray[i]));

		}
		
	}
	
}
