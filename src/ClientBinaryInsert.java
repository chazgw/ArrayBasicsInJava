

public class ClientBinaryInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an ordered array of Person object
		int maxSize = 100; // array size
		ClassDataArray orderedArray;  // 'arr' in book
		orderedArray = new ClassDataArray(maxSize);
		
		// Inserts
		
		// Currently fails with only 1 element; other cases are ok
		
		/*
		orderedArray.insert("Aardsma", "David", 37);	
		
		
		orderedArray.insert("Evans", "Patty", 24);
		
		
		orderedArray.insert("Foles", "Nick", 29);
		
		
		orderedArray.insert("Polychronopolous", "Steve", 37);
		
		
		orderedArray.insert(new Person("Smith","Lorraine",37));
		///*
		orderedArray.insert(new Person("Taylor","Chuck",118));
		*/
		
		System.out.println("Starting Array: ");

		
		for(Person currentPerson : orderedArray.getMyPersonArray()) {
			if(currentPerson != null) {
				System.out.println("currentPerson.getLast(): " + currentPerson.getLast());
			}
			else {
				break;
			}
		}
		

		//  person
		
		orderedArray.insertBinary3(new Person("Dykstra","Lenny",55));
		
		System.out.println("\n after Dykstra insert: ");
				
		loopThroughPersonArray(orderedArray.getMyPersonArray());
		
		
		//  person
		orderedArray.insertBinary3(new Person("Aardsma","David",35));
		
		System.out.println("\n after Aardsma insert: ");
				
		loopThroughPersonArray(orderedArray.getMyPersonArray());
			
			
		
		
		// First person
		orderedArray.insertBinary3(new Person("Papagiorgio","Nick",18));
				
		System.out.println("\n after Papagiogio insert: ");
				
		loopThroughPersonArray(orderedArray.getMyPersonArray());
		
		
		// Second person
		
		orderedArray.insertBinary3(new Person("Polychronopolous","Steve",29));
		
		System.out.println("\n after Polychronopolous insert: ");
		
		loopThroughPersonArray(orderedArray.getMyPersonArray());
		
		
	
		
			
		

		//  person
		orderedArray.insertBinary3(new Person("Zeus","Big Daddy",999));
				
		System.out.println("\n after Zeus insert: ");
				
		loopThroughPersonArray(orderedArray.getMyPersonArray());
					
		
	
		orderedArray.insertBinary3(new Person("Bon Jovi","John",57));
		
		System.out.println("\n after Bon Jovi insert: ");
		
		loopThroughPersonArray(orderedArray.getMyPersonArray());

				
		
		orderedArray.insertBinary3(new Person("Cardurmom","John",57));
		
		System.out.println("\n after Cardurmom insert: ");
		
		loopThroughPersonArray(orderedArray.getMyPersonArray());

		

		
	}
	
	
	public static void loopThroughPersonArray(Person[] persons) {
		for(Person currentPerson : persons) {
			if(currentPerson != null) {
				System.out.println("currentPerson.getLast(): " + currentPerson.getLast());
			}
			else {
				break;
			}
		}
	}

}