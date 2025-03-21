package day3;

import java.util.Scanner;

public class Solution {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if(N%2 == 1) {
        	System.out.println("Weird");
        }
        else if(( N%2==0 ) && (N >=2 )&& (N <= 5)) {
        	System.out.println("Not Weird");
        }
        else if (( N%2==0 )&& (N >= 6) && (N <= 20)) {
        	System.out.println("Not Weird");
        }
        else if(( N%2==0 ) && ( N > 20 )){
        	System.out.println("Weird");
        }
        
        	
		
	}
	
	void doExercice1() {
		System.out.println("Hello, World.");
		System.out.println("Hello, Java.");

	}
	void doExercice2() {
		Scanner scanner = new Scanner(System.in);
		int myInt1 = scanner.nextInt();
		int myInt2 = scanner.nextInt();
		int myInt3 = scanner.nextInt();
		scanner.close();
		
		System.out.println(myInt1);
		System.out.println(myInt2);
		System.out.println(myInt3);

	}

}
