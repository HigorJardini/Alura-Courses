
public class TestSum {
	
	public static void main(String[] args) {
		
		int count = 0;
		int total = 0;
		
		while(count <= 10) {
			// int total = 0; dont enter this because it ends the scope
			//total = total + count;
			total += count;
			count++;
		}
		
		System.out.println(total);
		
	}

}
