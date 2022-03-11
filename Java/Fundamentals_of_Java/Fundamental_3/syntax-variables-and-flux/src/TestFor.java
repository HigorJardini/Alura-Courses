
public class TestFor {

	public static void main(String[] args) {
		
		for(int count = 0; count < 10; count++) { // Start Scope
			System.out.println(count);
		} // End Scope
		//System.out.println(count); dont exist variable count because it ends the scope
	}
	
}
