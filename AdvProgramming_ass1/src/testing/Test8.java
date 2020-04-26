package testing;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("=================================");
		System.out.println("Please enter the first number:");
		int n1 = i.nextInt();
		System.out.println("Please enter the second number:");
		int n2 = i.nextInt();
		System.out.println("=================================");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Pick the operation you want:");
		int y = i.nextInt();
		System.out.println("=================================");
		switch (y) {
		case 1:
			System.out.println("The result is: " + (n1 + n2));
			break;
		case 2:
			System.out.println("The result is: " + (n1 - n2));
			break;
		case 3:
			System.out.println("The result is: " + (n1 * n2));
			break;
		case 4:
			System.out.println("The result is: " + (n1 / n2));
		}
	}
}
