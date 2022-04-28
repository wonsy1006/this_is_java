package thisIsJava;

public class Chapter4_5 {

	public static void main(String[] args) {
		
		int x;
		int y;
		int sum;
		
		for( x = 1; x <= 10; x++) {
			for(y = 1; y <= 10; y++) {
				sum = 4*x + 5*y;
				if (sum == 60) {
					System.out.println(x + ", " + y);
				}
			}
		}
		
	}

}
