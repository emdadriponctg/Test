package Test;

public class Fib {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		
		for(int i =0; i<10; i++) {
			System.out.println(a);
			
			a = a + b;
			b = a - b;
		}

	}

}
