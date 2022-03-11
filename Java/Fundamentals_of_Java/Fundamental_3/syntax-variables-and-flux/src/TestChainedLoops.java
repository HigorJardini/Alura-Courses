
public class TestChainedLoops {

	public static void main(String[] args) {
		
		for (int multiplier = 1; multiplier <= 10; multiplier++) {
			
			for (int decimals = 1; decimals <= 10; decimals++) {
				System.out.print(multiplier + " X " + decimals + " = " + (multiplier * decimals));
				System.out.print(" - ");
			}
			
			System.out.println();
		}
		
	}
	
}
