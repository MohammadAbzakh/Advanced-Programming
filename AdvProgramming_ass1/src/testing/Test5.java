package testing;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("==============================");
		System.out.print("Please enter the first number:");
		int n1=scanner.nextInt();
		System.out.println("==============================");
		System.out.print("Please enter the second number:");
		int n2=scanner.nextInt();
		if(n1>n2){
			System.out.println("=======================================");
			System.out.println("The greater number is n1 and it is "+n1);
			}
		else {
			System.out.println("==========================================");
				System.out.println("The greater number is n2 and it is "+n2);
			}
		}

	}

