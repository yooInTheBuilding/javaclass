package ch04_if;

import java.util.Scanner;

public class Ex06_IfExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int var1 = sc.nextInt();
		if(var1 % 15 == 0) {
			System.out.println("3 과 5의 공배수");
		}else if(var1 % 3 == 0) {
			System.out.println("3의 배수");
		}else if(var1 % 5 ==0) {
			System.out.println("5의 배수");
		}else {
			System.out.println("none");
		}
	}

}
