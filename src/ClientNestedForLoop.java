
public class ClientNestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		// outer loop
		for(int i = 0; i < 10; i++) {
			
			System.out.println("outer loop - i is: " + i);
			
			// inner loop
			for(int j = 0; j < 10; j++) {
				
				System.out.println("  inner loop - j is: " + j);
				
			}
			
		}
		*/
		
		
		// Multiplication tables 
		// outer loop
		for(int i = 1; i <= 12; i++) {
			
			// inner loop
			for(int j = 1; j <= 12; j++) {
				
				System.out.println(String.format("%d * %d = %d", i, j, i * j));
				
			}
			
		}
		
	}

}
