package ch04_if;

import java.util.Scanner;

public class Ex02_IfExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수: ");
		int javaScore = sc.nextInt();
		
		if(javaScore >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
			}
	}

}
