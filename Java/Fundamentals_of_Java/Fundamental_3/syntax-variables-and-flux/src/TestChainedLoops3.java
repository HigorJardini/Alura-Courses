
public class TestChainedLoops3 {

	public static void main(String[] args) {
		
		for (int line = 0; line < 10; line++) {
			
			// Example with break;
			//for (int column  = 0; column < 10; column++) {
			//	if (column > line) {
			//		break; // Get out of the nearest loop
			//	}
			//	System.out.print("*");
			//}
			
			for (int column  = 0; column <= line; column++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
}
