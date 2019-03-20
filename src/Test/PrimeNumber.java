package Test;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter prime No's limit:-");
		int limit = scan.nextInt();
		
		for(int i = 1; i<50; i++) {
			boolean isPrime = true;
			
			for(int j = 2; j<i; j++) {
				if(i% j ==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				System.out.println(i + " ");
		}

	}

}
