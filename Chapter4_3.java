package thisIsJava;

public class Chapter4_3 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		 for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		} 
		
		// 오답 -> 문제는 1부터 100까지
		/* for(int i =3; i <= 100; i += 3) {
			sum += i;
		} */ 
		
		System.out.println(sum);

	}

}
