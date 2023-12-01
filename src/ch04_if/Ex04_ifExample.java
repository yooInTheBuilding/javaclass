package ch04_if;
import java.util.Scanner;

public class Ex04_ifExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String result = "";
		System.out.print("점수: ");
		int score = sc.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("입력범위를 초과하였습니다");
		}else {
			if(score >= 90) {
				result = "A";
			}else if(score >= 80) {
				result = "B";
			}else if(score >= 70) {
				result = "C";
			}else if(score >= 60) {
				result = "D";
			}else {
				result = "F";
			}
		}
		System.out.println(result);
		

	}
}
