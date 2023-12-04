package ch04_if;

import java.util.Scanner;

public class Ex08_IfExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.nextLine();
		int b = sc.nextInt();
		sc.nextLine();
		int c = sc.nextInt();
		int result = 0;
		
		if(a > b) {
			if(a > c) {
				result = a;
			}else {
				result = c;
			}
		}else {
			if(b > c) {
				result = b;
			}else {
				result = c;
			}
		}
		
		System.out.println("가장 큰 수는 " + result + "입니다");
	}

}
