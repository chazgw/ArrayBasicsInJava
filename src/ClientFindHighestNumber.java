
public class ClientFindHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] temperatures = {50,60,88,72,65};
		int highestTemperature;
		// Find the highest value:
		
		// We'll take the first value as the highest to start;
		// then we'll loop through and see if there are any higher values
		if(temperatures.length > 0) {
			highestTemperature = temperatures[0];
			// int highestTemperature = 0;  // No because this value may be higher than 
			// all the others and give us a false value
		}
		else {
			highestTemperature = -1;  // just a scheme, not real-world ready!
		}
		
		
		for(int i = 1; i < temperatures.length; i++) {
			
			if(temperatures[i] > highestTemperature) {
				// set new highest temperature:
				highestTemperature = temperatures[i];
			}
			
		}
		
		// Output highest temp
		System.out.println("highestTemperature: " + highestTemperature);
		
	} // end main

}
