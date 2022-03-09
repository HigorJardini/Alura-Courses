
public class TestPointFloat {
	
	public static void main(String[] args) {
		
		double salary;
		salary = 1250.20;
		System.out.println("Salary: " + salary);
		
		double division = 3.14 / 2;
		System.out.println(division);
		
		// If is int var your result is int but with two values having int numbers
		// Int - Int results Int
		int nextDivision = 5 / 2;
		System.out.println(nextDivision);
		
		// Running layers: (5 / 2) First and after insert the value to a doblue variable, result: 2.0
		double nextDivision2 = 5 / 2;
		System.out.println(nextDivision2);
		
		// Force the java to use float value to calculate on first layer execution, result: 2.5
		double nextDivision3 = 5.0 / 2;
		System.out.println(nextDivision3);
		
	}
	
}
