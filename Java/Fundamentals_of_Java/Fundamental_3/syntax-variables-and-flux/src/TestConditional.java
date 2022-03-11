
public class TestConditional {

	// main - CTRL + Space
	public static void main(String[] args) {

		// sysout - CTRL + Space
		System.out.println("Test");

		int age = 15;
		int quantityPersons = 3;

		if (age >= 18) {
			System.out.println(" >= 18 ");
		} else if (age < 16 && quantityPersons > 1) {
			System.out.println(true);
		} else {
			System.out.println(" < 18");
		}
	}

}
