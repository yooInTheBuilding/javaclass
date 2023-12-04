package ch04_if;

import java.util.Scanner;

public class Ex07_IfExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		int score = sc.nextInt();
		
		if(year == 4) {
			if(score >= 70) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}else {
			if(score >= 60) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}
	}

}
