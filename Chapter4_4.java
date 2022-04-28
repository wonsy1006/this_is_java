package thisIsJava;

public class Chapter4_4 {

	public static void main(String[] args) {
		
		// 1번째 답
		 /* int dice1 = 0;
		int dice2 = 0;
		
		while(dice1 + dice2 != 5) {
			dice1 = (int)(Math.random()*6 ) + 1;
			dice2 = (int)(Math.random()*6) + 1;
			System.out.println("(" + dice1 + ", " + dice2 + ")");
		} */
		
		
		// 2번째 답
		int dice1;
		int dice2;
		
		while(true) {
			dice1 = (int)(Math.random()*6 ) + 1;
			dice2 = (int)(Math.random()*6) + 1;
			
			System.out.println("(" + dice1 + ", " + dice2 + ")");
			
			if(dice1 + dice2 == 5) {
				break;
			}
		}
		
		

	}

}
