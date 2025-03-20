package day4;

import java.util.Scanner;

public class Operators {
		public void bai2 () {
			double distance = 5000;
			int hours = 1;
			int minutes = 30;
			int seconds = 55;
			double totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
			double speedMetersPerSecond = distance / totalSeconds;
			double speedKmPerHour = (distance / 1000) / (totalSeconds / 3600);
	        double speedMilesPerHour = (distance / 1609) / (totalSeconds / 3600);
	        System.out.println("Your speed in meters/second is " + speedMetersPerSecond);
	        System.out.println("Your speed in km/h is " + speedKmPerHour);
	        System.out.println("Your speed in miles/h is " + speedMilesPerHour);
		}
		public void bai3 () {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Input 1st integer: ");
			int number1 = scanner.nextInt();
			System.out.println("Input 2st integer: ");
			int number2 = scanner.nextInt();
			
			int sum = number1 + number2;
			int difference = number1 - number2;
			int product = number1 * number2;
			double average = (number1 + number2) / 2.0;
	        int distance = Math.abs(number1 - number2);
	        int max = Math.max(number1, number2);
	        int min = Math.min(number1, number2);
			scanner.close();
			System.out.println("Sum of two integers: " + sum);
	        System.out.println("Difference of two integers: " + difference);
	        System.out.println("Product of two integers: " + product);
	        System.out.printf("Average of two integers: %.2f\n", average);
	        System.out.println("Distance of two integers: " + distance);
	        System.out.println("Max integer: " + max);
	        System.out.println("Min integer: " + min);
	        scanner.close();
		}
//		public void bai4() {
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("Input integer: ");
//			int number1 = scanner.nextInt();		
//			scanner.close();
//		}
}
