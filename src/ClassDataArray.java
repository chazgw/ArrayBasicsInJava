// glorified array
class ClassDataArray
{
	private Person[] myPersonArray;
	private int nElems;
	
	private static int timesInsertBinary3Called = 0;
	private static int timesInsertBinary4Called = 0;
							
	public ClassDataArray(int max) {
							
		myPersonArray = new Person[max];
		nElems = 0;
	}

	public Person find(String searchName) { 
		return null;
	}
	
	
	public Person findBinarySearch(String searchName) {
		
		
		// overall flag for a found number
		boolean nameFound = false;
		
		// Keep track of where we are
		int currentIndex;

		// Keep track of the range
		// Adjust accordingly on each loop pass;
		// Divide by roughly 2 on each pass
		
		// On the first pass, set the lower end of the range
		// to 0
		int lowerBounds = 0;
		int upperBounds = myPersonArray.length - 1;
		
		int numberOfPasses = 0;
		
		
		// Search!
		//while(numberFound == false) {
		while(nameFound == false && lowerBounds <= upperBounds) {
			
			numberOfPasses++;
			
			// Debug
			System.out.println("lower bounds is now: " + lowerBounds);
			System.out.println("upper bounds is now: " + upperBounds);
			
			// first pass
			// start in the "middle"				
			currentIndex = (lowerBounds + upperBounds) / 2;
			// On first pass, this is 0 + 5
			// Second Pass: (3 + 5) / 2 = 4 
			
			
			if(myPersonArray[currentIndex] != null) {
				System.out.println("Last name of Person at current index: " + myPersonArray[currentIndex].getLast());
			
		 
				// if number is found, exit:
				if(searchName.compareTo(myPersonArray[currentIndex].getLast()) == 0) {
					System.out.println("name found!");
					System.out.println("name is: " + myPersonArray[currentIndex]);
					System.out.println("numberOfPasses: " + numberOfPasses);
					nameFound = true;
					return myPersonArray[currentIndex];
		
				}
				// if not, test for value
				// (this is the case for the first pass)
				else if(searchName.compareTo(myPersonArray[currentIndex].getLast()) > 0) {
					// look at the upper range
					
					// set the new range
					lowerBounds = currentIndex + 1;  // now lower index is 4; was 3
					
				}
				else if(searchName.compareTo(myPersonArray[currentIndex].getLast()) < 0) {
					// look at the lower range
					upperBounds = currentIndex - 1;
					
				}
				
			
			// "Bottom" of loop
			
			
			// Debug
				System.out.println("numberOfPasses is now: " + numberOfPasses);
			}
			else {
				System.out.println("Person is null");
			}

		}
		
		return null;
	}  // end findBinarySearch()
	
	
	
	public Person findBinarySearchHandleNull(String searchName) {
		
		
		// overall flag for a found number
		boolean nameFound = false;
		
		// Keep track of where we are
		int currentIndex;

		// Keep track of the range
		// Adjust accordingly on each loop pass;
		// Divide by roughly 2 on each pass
		
		// On the first pass, set the lower end of the range
		// to 0
		int lowerBounds = 0;
		int upperBounds = myPersonArray.length - 1;
		
		int numberOfPasses = 0;
		
		
		// Search!
		//while(numberFound == false) {
		while(nameFound == false && lowerBounds <= upperBounds) {
			
			numberOfPasses++;
			
			// Debug
			System.out.println("lower bounds is now: " + lowerBounds);
			System.out.println("upper bounds is now: " + upperBounds);
			
			// first pass
			// start in the "middle"				
			currentIndex = (lowerBounds + upperBounds) / 2;
			// On first pass, this is 0 + 5
			// Second Pass: (3 + 5) / 2 = 4 
			
			
			if(myPersonArray[currentIndex] != null) {
				System.out.println("Last name of Person at current index: " + myPersonArray[currentIndex].getLast());
			
				// if number is found, exit:
				if(searchName.compareTo(myPersonArray[currentIndex].getLast()) == 0) {
					System.out.println("name found!");
					System.out.println("name is: " + myPersonArray[currentIndex]);
					System.out.println("numberOfPasses: " + numberOfPasses);
					nameFound = true;
					return myPersonArray[currentIndex];
		
				}
				// if not, test for value
				// (this is the case for the first pass)
				else if(searchName.compareTo(myPersonArray[currentIndex].getLast()) > 0) {
					// look at the upper range
					
					// set the new range
					lowerBounds = currentIndex + 1;  // now lower index is 4; was 3
					
				}
				else if(searchName.compareTo(myPersonArray[currentIndex].getLast()) < 0) {
					// look at the lower range
					upperBounds = currentIndex - 1;
					
				}
				// "Bottom" of loop
			
			
			// Debug
				System.out.println("numberOfPasses is now: " + numberOfPasses);
			}
			else {
				System.out.println("Person is null");
				upperBounds = currentIndex - 1;
			}

		}
		
		return null;
	}
	
	// Assumes a sorted array
	public boolean insertBinary(Person tempPerson)						
	{
		//Person tempPerson = new Person(last, first, age);
		
		boolean success = false;
		
		// Find the spot to insert
		
		// Keep track of where we are
		int currentIndex;

		// On the first pass, set the lower end of the range
		// to 0, and upper range to last element
		int lowerBounds = 0;
		int upperBounds = myPersonArray.length - 1;
		
		int numberOfPasses = 0;
		
		
		//while(success == false) {
		while(numberOfPasses < 8) {
		//if(numberOfPasses == 0) {
			
			numberOfPasses++;  // probably not necessary with insert???
			
			currentIndex = (lowerBounds + upperBounds) / 2;
			
			System.out.println("numberOfPasses: " + numberOfPasses);
			
			
			// if the new person is greater than the element before it,
			// and less than the element after it, insert. And shift.
			// Check for nulls as well.
			if(myPersonArray[currentIndex] == null) {
				System.out.println("Person at " + currentIndex + " is null");
				
				upperBounds = currentIndex - 1;
				System.out.println("Dropping upper bounds to " + upperBounds);
			}
			else {
				System.out.println("Person at " + currentIndex + " is NOT "
						+ "null");
				System.out.println("myPersonArray[currentIndex].getLast(): " + myPersonArray[currentIndex].getLast());
				
				/*
				if(myPersonArray[currentIndex + 1] != null) {
					System.out.println("myPersonArray[currentIndex + 1].getLast(): " + myPersonArray[currentIndex + 1].getLast());
				}
				System.out.println("tempPerson.getLast(): " + tempPerson.getLast());
				*/
				
				// Stay in-bounds
				if(currentIndex + 1 <= myPersonArray.length && myPersonArray[currentIndex + 1] != null) {
					//System.out.println("myPersonArray[currentIndex + 1].getLast(): " + myPersonArray[currentIndex + 1].getLast());
				}
			
				// if a spot is found - success
				if(myPersonArray.length == 0) {
					myPersonArray[0] = tempPerson;
				}
				else if(myPersonArray[currentIndex].getLast().compareTo(tempPerson.getLast()) < 0  && myPersonArray[currentIndex + 1] == null
						|| myPersonArray[currentIndex].getLast().compareTo(tempPerson.getLast()) < 0  &&
						tempPerson.getLast().compareTo(myPersonArray[currentIndex + 1].getLast()) < 0) {
					// found the appropriate spot - 
					// insert new and move all other elements up one spot
					System.out.println("success!");
					success = true;
					

					// insert new
					
					// move other elements down
					for(int i = myPersonArray.length - 1; i > currentIndex; i--) {
						// assign higher spot with
						myPersonArray[i] = myPersonArray[i - 1];
					}
		
					myPersonArray[currentIndex + 1] = tempPerson;
					
					nElems++; // increment size

				} 
				// temp Person is < current person
				else if(tempPerson.getLast().compareTo(myPersonArray[currentIndex].getLast()) > 0 ) {
					System.out.println("tempPerson is higher than current");
					lowerBounds = currentIndex + 1; 
					System.out.println("--lowerBounds is now " + lowerBounds);
				}
				// temp Person is > current person
				else if(tempPerson.getLast().compareTo(myPersonArray[currentIndex].getLast()) < 0 ) {
					System.out.println("tempPerson is lower than current");
					
					upperBounds = currentIndex - 1;
					System.out.println("--upperBounds is now " + upperBounds);


				}
				
			}
				
		}
		
		// Debug - loop through
		System.out.println("After insert():");

		for(Person currentPerson : myPersonArray) {
			if(currentPerson != null) {
				System.out.println("currentPerson.getLast(): " + currentPerson.getLast());
			}
			else {
				break;
			}
		}
		
		return success;
	}
	
	
	
	
	
	
	
	
	
	
	public boolean insertBinary2(Person tempPerson) {
		System.out.println("\nCALLING insertBinary2 ");
		//Person tempPerson = new Person(last, first, age);
		
		boolean success = false;
		
		// Find the spot to insert
		
		// Keep track of where we are
		int currentIndex;

		// On the first pass, set the lower end of the range
		// to 0, and upper range to last element
		int lowerBounds = 0;
		int upperBounds = myPersonArray.length - 1;
		
		int numberOfPasses = 0;
		
		
		//while(success == false) {
		while(numberOfPasses < 8) {
		//if(numberOfPasses == 0) {
			
			numberOfPasses++;  // probably not necessary with insert???
			
			currentIndex = (lowerBounds + upperBounds) / 2;
			
			System.out.println("numberOfPasses: " + numberOfPasses);
			
			
			// if the new person is greater than the element before it,
			// and less than the element after it, insert. And shift.
			// Check for nulls as well.
			
			// First case - if array is empty, insert
			if(nElems == 0) {
				myPersonArray[0] = tempPerson;
				nElems++;
				System.out.println("Start - Inserting Person at index 0");
				return true;  // don't forget!
			}
			else if(myPersonArray[currentIndex] == null) {
				System.out.println("Person at " + currentIndex + " is null");
				System.out.println("currentIndex: " + currentIndex);

				upperBounds = currentIndex - 1;
				System.out.println("--upperBounds is now " + upperBounds);
				System.out.println("--lowerBounds is now " + lowerBounds);
			}
			else {
				System.out.print("Person at " + currentIndex + " is NOT "
						+ "null");
				
				System.out.println("...myPersonArray[currentIndex].getLast(): " + myPersonArray[currentIndex].getLast());
				
				if(myPersonArray[currentIndex + 1] != null) {
					System.out.println("...next highest person is NOT null:::myPersonArray[currentIndex + 1].getLast(): " + myPersonArray[currentIndex + 1].getLast());
				}
				else {
					System.out.println("...next highest person is null");
					//myPersonArray[currentIndex + 1] = tempPerson;
				}
				//System.out.println("tempPerson.getLast(): " + tempPerson.getLast());
				
				// Stay in-bounds
				if(currentIndex + 1 <= myPersonArray.length && myPersonArray[currentIndex + 1] != null) {
					//System.out.println("myPersonArray[currentIndex + 1].getLast(): " + myPersonArray[currentIndex + 1].getLast());
				}
			
				// if a spot is found - success
				if(myPersonArray.length == 0) {
					myPersonArray[0] = tempPerson;
					System.out.println("IF");
				}
				else if(myPersonArray[currentIndex].getLast().compareTo(tempPerson.getLast()) < 0  
						&& myPersonArray[currentIndex + 1] == null
						|| myPersonArray[currentIndex].getLast().compareTo(tempPerson.getLast()) < 0 
						&& tempPerson.getLast().compareTo(myPersonArray[currentIndex + 1].getLast()) < 0 
						|| tempPerson.getLast().compareTo(myPersonArray[currentIndex].getLast()) < 0 && myPersonArray[currentIndex + 1] == null )
				{
					System.out.println("ELSE IF 1");
					// found the appropriate spot - 
					// insert new and move all other elements up one spot
					System.out.println("success!");
					success = true;
					
	
					// move other elements down
					for(int i = myPersonArray.length - 1; i > currentIndex; i--) {
						// assign higher spot with
						myPersonArray[i] = myPersonArray[i - 1];
					}
		
					// insert new tempPerson:
					myPersonArray[currentIndex + 1] = tempPerson;
					
					nElems++; // increment size

				} 
				// temp Person is < current person
				else if(tempPerson.getLast().compareTo(myPersonArray[currentIndex].getLast()) > 0 ) {
					System.out.println("ELSE IF 2");
					System.out.println(":tempPerson " + tempPerson.getLast() + "is higher than current, which is...");
					//System.out.println("::tempPerson.getLast():" + tempPerson.getLast());
					lowerBounds = currentIndex + 1; 
					System.out.println("--lowerBounds is now " + lowerBounds);
					System.out.println("--upperBounds is now " + upperBounds);				}
				// temp Person is > current person
				else if(tempPerson.getLast().compareTo(myPersonArray[currentIndex].getLast()) < 0 ) {
					System.out.println("ELSE IF 3");
					System.out.println("myPersonArray[currentIndex].getLast().compareTo(tempPerson.getLast()): " +
							myPersonArray[currentIndex].getLast().compareTo(tempPerson.getLast()));
					System.out.println(":tempPerson " + tempPerson.getLast() + " is lower than current, which is " + myPersonArray[currentIndex].getLast());
					//System.out.println("::tempPerson.getLast():" + tempPerson.getLast());
					upperBounds = currentIndex - 1;
					System.out.println("--upperBounds is now " + upperBounds);
					System.out.println("--lowerBounds is now " + lowerBounds);

				}
				
			}
				
		}
		
		// Debug - loop through
		System.out.println("After insert():");

		for(Person currentPerson : myPersonArray) {
			if(currentPerson != null) {
				System.out.println("currentPerson.getLast(): " + currentPerson.getLast());
			}
			else {
				break;
			}
		}
		
		return success;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	public boolean insertBinary3(Person tempPerson) {
		timesInsertBinary3Called++;
		System.out.println("\nCALLING insertBinary3() ");
		System.out.println("\nTrying to insert " + tempPerson.getLast());
		System.out.println("-times: " + timesInsertBinary3Called);

		//Person tempPerson = new Person(last, first, age);
		
		boolean success = false;
		
		// Find the spot to insert
		
		// Keep track of where we are
		int currentIndex;

		// On the first pass, set the lower end of the range
		// to 0, and upper range to last element
		int lowerBounds = 0;
		int upperBounds = nElems - 1;
		
		int numberOfPasses = 0;
		
		
		while(success == false) {
			
			numberOfPasses++;  // probably not necessary with insert???
			
			currentIndex = (lowerBounds + upperBounds) / 2;
			
			System.out.println("numberOfPasses: " + numberOfPasses);
			
			
			System.out.println("--upperBounds is now " + upperBounds);
			System.out.println("--lowerBounds is now " + lowerBounds);
			System.out.println("--nElems is now " + nElems);
			System.out.println("--currentIndex is now " + currentIndex);
			
			// if the new person is greater than the element before it,
			// and less than the element after it, insert. And shift.
			// Check for nulls as well.
			
			// First case - if array is empty, insert
			if(nElems == 0) {
				myPersonArray[0] = tempPerson;
				nElems++;
				upperBounds = 0;  // manip
				System.out.println("Start - Inserting Person at index 0 ( " + tempPerson.getLast() + ")");
				success = true;
				return true;  // don't forget!
			}
			
			else {  // Second case - there is at least 1 element in the array

				if(myPersonArray[currentIndex].getLast().compareTo(tempPerson.getLast()) < 0) {
					System.out.println("tempPerson " + tempPerson.getLast() + " is greater than currentIndex ("+myPersonArray[currentIndex].getLast()+")");
					
					// and if person above is null, insert
					if(myPersonArray[currentIndex + 1] == null) {
						System.out.println("IF - null");
						// insert
						System.out.println("person above is null");
						success = true;
						myPersonArray[currentIndex + 1] = tempPerson;
						nElems++;
					}
					else if(tempPerson.getLast().compareTo(myPersonArray[currentIndex + 1].getLast()) < 0) {
						System.out.println("person above is greater; inserting new person at current index");
						success = true;
						
						for(int i = myPersonArray.length - 1; i > currentIndex; i--) {
							// assign higher spot with
							myPersonArray[i] = myPersonArray[i - 1];
							
						}
						myPersonArray[currentIndex + 1] = tempPerson;
						System.out.println("myPersonArray[currentIndex]:  " + myPersonArray[currentIndex].getLast());
						nElems++;
						System.out.println("ELSE IF ending ");
						
					}
					else if(tempPerson.getLast().compareTo(myPersonArray[currentIndex + 1].getLast()) > 0) {
						lowerBounds = currentIndex + 1;
						
						System.out.print(" and tempPerson( " + tempPerson.getLast() +
								") is greater than myPersonArray[currentIndex + 1], which is " +
								myPersonArray[currentIndex + 1].getLast() + "; moving lowerBounds up to " + lowerBounds);
						System.out.print("\n");
						
					}
					
				}
				else if(tempPerson.getLast().compareTo(myPersonArray[currentIndex].getLast()) < 0) {
					
					System.out.println("tempPerson " + tempPerson.getLast() + " is less than currentIndex (" +
							myPersonArray[currentIndex].getLast()+")");
					System.out.println("currentIndex: " + currentIndex);

					if(nElems > 0) {
						
						if(myPersonArray[currentIndex + 1] == null) {
							// insert
							System.out.println("-person above is null");
							
							if(tempPerson.getLast().compareTo(myPersonArray[currentIndex].getLast()) < 0) {
								success = true;
								for(int i = myPersonArray.length - 1; i > currentIndex; i--) {
									// assign higher spot:
									myPersonArray[i] = myPersonArray[i - 1];
									
								}
								myPersonArray[currentIndex] = tempPerson;
								nElems++;
							}
							
						}
						else if(tempPerson.getLast().compareTo(myPersonArray[currentIndex + 1].getLast()) < 0
								&& tempPerson.getLast().compareTo(myPersonArray[currentIndex].getLast()) > 0){
							System.out.println("tempPerson " + tempPerson.getLast() + " is less than currentIndex + 1 (" +
									myPersonArray[currentIndex + 1].getLast() +"),"
											+ " and tempPerson " + tempPerson.getLast() + 
											" is greater than currentIndex (" + myPersonArray[currentIndex].getLast() + ") ");
							
							success = true;
							for(int i = myPersonArray.length - 1; i > currentIndex; i--) {
								// assign higher spot with
								myPersonArray[i] = myPersonArray[i - 1];
								
							}
							myPersonArray[currentIndex] = tempPerson;
							nElems++;
							
						}
						
						else if (currentIndex == 0) {
							System.out.println("ELSE");
							// upperBounds = currentIndex - 1;
							System.out.print(" and tempPerson( " + tempPerson.getLast() +
									") is .. than myPersonArray[currentIndex + 1], which is " +
									myPersonArray[currentIndex + 1].getLast() + "; moving upperBounds down to " + lowerBounds);
							System.out.print("\n");
							
							success = true;
							for(int i = myPersonArray.length - 1; i > currentIndex; i--) {
								// assign higher spot with
								myPersonArray[i] = myPersonArray[i - 1];
								
							}
							myPersonArray[currentIndex] = tempPerson;
							nElems++;
							
						}
						
					}
					
					upperBounds = currentIndex - 1;
				}
					
			}
			
			
		}
		return success;
			
	}
			
	
	
	
	
	
	
	
	
	
	

	public boolean insertBinary4(Person tempPerson) {
		timesInsertBinary4Called++;
		System.out.println("\nCALLING insertBinary4() ");
		System.out.println("\nTrying to insert " + tempPerson.getLast());
		System.out.println("-times: " + timesInsertBinary3Called);

		//Person tempPerson = new Person(last, first, age);
		
		boolean success = false;
		
		// Find the spot to insert
		
		// Keep track of where we are
		int currentIndex = 0;

		// On the first pass, set the lower end of the range
		// to 0, and upper range to last element
		int lowerBounds = 0;
		int upperBounds = nElems - 1;
		
		int numberOfPasses = 0;
		
		
		while(lowerBounds != upperBounds || nElems < 1) {
		//while(numberOfPasses < 8 && lowerBounds <= upperBounds) {
		//while(numberOfPasses < 4) {
		//if(numberOfPasses == 0) {
			
			numberOfPasses++;  // probably not necessary with insert???
			
			currentIndex = (lowerBounds + upperBounds) / 2;
			
			System.out.println("numberOfPasses: " + numberOfPasses);
			
			
			System.out.println("--upperBounds is now " + upperBounds);
			System.out.println("--lowerBounds is now " + lowerBounds);
			System.out.println("--nElems is now " + nElems);
			System.out.println("--currentIndex is now " + currentIndex);
			
			if(nElems == 0) {
				myPersonArray[0] = tempPerson;
				nElems++;
				upperBounds = 0;  // manip
				System.out.println("Start - Inserting Person at index 0 ( " + tempPerson.getLast() + ")");
				success = true;
				return true;  // don't forget!
			}
			
			else { 
				if(tempPerson.getLast().compareTo(myPersonArray[currentIndex].getLast()) < 0) {
					upperBounds = currentIndex - 1;
				}
				else if(tempPerson.getLast().compareTo(myPersonArray[currentIndex].getLast()) > 0) {
					lowerBounds = currentIndex + 1;
				}
			}
			
		}  // end while
		
		for(int i = myPersonArray.length - 1; i > currentIndex; i--) {
			// assign higher spot with
			myPersonArray[i] = myPersonArray[i - 1];
			
		}
		myPersonArray[currentIndex ] = tempPerson;
		nElems++;
		
		
		System.out.println("Inserting at " + currentIndex);
		return success;
		
	}
		
		
	
	
		
		
	
	
	

	public boolean insert(String last, String first, int age)						
	{
		return insert(new Person(last,first,age));
		
	}
	
	// overload (not in book)
	public boolean insert(Person person) {
		
		if(nElems < myPersonArray.length) {
			myPersonArray[nElems] = person;
			nElems++; // increment size
			return true;
		}
		return false;
	}
	

	// Linear deletion method
	public boolean delete(String searchName) {

		int j = 0; // broken out so we can access later
		
		for(; j < nElems; j++) {  // omitting the LCV part
			
			if(myPersonArray[j].getLast().equals(searchName)) {
				break;  // this retains the value of the LCV for further use
			}
			
		}
		
		// if we haven't found it, then 'j' will be equal to
		// the number of elements in the array.
		if(j == nElems) { 
			return false;  // We didn't find it
		}

		// Now, remove that element, and shift the others down:
		// (This actually just moves the upper elements down,
		// and overwrites the deleted one:
		
		// 
		for(int k = j; k < nElems; k++) {
			// shift down
			if(k + 1 < nElems) {
				myPersonArray[k] = myPersonArray[k + 1];
			}
			// reduce the number of elements by 1:
			nElems--;
			
		}
		
		return true;

	}
	
	
	public Person[] getMyPersonArray() {
		return myPersonArray;
	}

}  // end class ClassDataArray


