package Test;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		int factorial = value;
		
		for(int i = (value -1); i>1; i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of number is " + factorial);
	}

}
