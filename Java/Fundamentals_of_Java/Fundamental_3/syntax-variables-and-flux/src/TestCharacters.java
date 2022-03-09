
public class TestCharacters {
	
	public static void main(String[] args) {
		
		char letter = 'h';
		// Storage limit: 1 Character
		// Java save this character in value from table Unicode reference to letter
		// 'letter' don't function "letter"
		// Empty value does not work because need value from table unicode
		System.out.println(letter);
		
		// Example unicode
		char valueUnicode = 66;
		// Result is letter B, 66 on table unicode is reference to character B
		System.out.println(valueUnicode);
		
		
		// valueUnicode = valueUnicode + 1;
		// Does not compile
		// Java automatic conversion this result to larger type, in this case is INT, the number 1 is integer
		
		valueUnicode = (char)(valueUnicode + 1);
		// Comment: Int to char is invalid, but char to int gives success
		System.out.println(valueUnicode);
		
		
		String word = "Test Alura";
		// "letter" don't function 'letter'
		System.out.println(word);
		
		word =   word + 2028;
		word +=  2;
		
		System.out.println(word);
		
	}

}
