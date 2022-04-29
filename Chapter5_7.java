package thisIsJava;

public class Chapter5_7 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		int temp;
		
		for(int a = 0; a < array.length - 1; a++) {
			for(int b = a+1; b < array.length; b++) {
				if(array[a] > array[b]) {
					temp = array[a];
					array[a] = array[b];
					array[b] = temp;
					
				}
			}
		}
		
		System.out.println("max : " + max);

	}

}
