package ch04_if;

import java.util.Scanner;

public class Ex05_IfExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int var1 = sc.nextInt();
		if(var1 > 0) {
			System.out.println("양수");
		}else if(var1 == 0) {
			System.out.println("0");
		}else {
			System.out.println("음수");
		}
	}

}
