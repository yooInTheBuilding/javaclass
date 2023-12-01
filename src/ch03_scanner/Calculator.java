package ch03_scanner;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.: ");
		int num1 = sc.nextInt();
		System.out.println("\n숫자를 입력하세요.: ");
		int num2 = sc.nextInt();
		int result = num1 + num2;
		System.out.println(num1 + num2);
	}

}
