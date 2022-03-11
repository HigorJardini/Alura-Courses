
public class TestScope {
	
	public static void main(String[] args) {
		
		int age = 15;
		int quantityPersons = 3;
		// boolean permission = quantityPersons > 1;
		
		// Error
		//if(quantityPersons >= 2) {
		//
		//	var permission dont exists
		//	boolean permission = true;
		//  var permission exists
		//} else { var permission dont exists - this is error, var dont exist in the line
		//	boolean permission = false;
		//}

		
		// Success
		// boolean permission;
		//if(quantityPersons >= 2) {
		//	permission = true;
		//} else {
		//	permission = false;
		//}
		
		
		boolean permission = quantityPersons >= 2 ? true : false;

		if (age >= 18 || permission) {
			System.out.println(" >= 18 ");
		} else {
			System.out.println(" < 18");
		}
		
	}
	
}
