package testing;

import java.util.Scanner;


public class Test4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("==============================");
		System.out.print("Please enter the first number:");
		int n1=scanner.nextInt();
		System.out.println("==============================");
		System.out.print("Please enter the second number:");
		int n2=scanner.nextInt();
		int sum=n1+n2;
		System.out.println("==============================");
		System.out.println("The result is : "+sum);

	}

}
