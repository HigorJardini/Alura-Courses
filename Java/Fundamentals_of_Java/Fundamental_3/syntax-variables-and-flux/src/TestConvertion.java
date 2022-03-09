
public class TestConvertion {
	
	public static void main(String[] args) {
		double salary = 1270.20;
		int value     = (int) salary;
		// "(int) var", operation name: Type Casting
		System.out.println(value);
		
		// Promotion value, "int" to double, success convertion
		//double value = 3;
		
		// Curiosity: type "int" max limit is -32,0,32 = (32 bytes)
		
		long longValue = 55416541565L;
		// If the number is long need add L on end value, result (number)L;
		System.out.println(longValue);
		// 64 Bytes value
		
		float floatValue = 3.14f;
		// Java to identify float needs to add f to the final value, otherwise it will be double value, but recommended to use is double
		System.out.println(floatValue);
		
		short tinyValue = 1234;
		System.out.println(tinyValue);
		
		byte extraTinyValue = 123;
		System.out.println(extraTinyValue);
	}
}
