
public class TestConditional2 {

	// main - CTRL + Space
	public static void main(String[] args) {

		// sysout - CTRL + Space
		System.out.println("Test");

		int age = 15;
		int quantityPersons = 3;
		boolean permission = quantityPersons > 1;

		if (age >= 18 || permission) {
			System.out.println(" >= 18 ");
		} else {
			System.out.println(" < 18");
		}
		
		
	}

}
