package ch03_scanner;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.: ");
		int num1 = sc.nextInt();
		System.out.print("\n숫자를 입력하세요.: ");
		int num2 = sc.nextInt();
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		System.out.println(name);
		
		sc.nextLine();
		
		System.out.print("주소입력: ");
		String adress = sc.nextLine();
		System.out.print(adress);
		int result = num1 + num2;
		System.out.println(num1 + num2);
		
	}

}
