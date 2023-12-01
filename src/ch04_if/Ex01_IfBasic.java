package ch04_if;

public class Ex01_IfBasic {

	public static void main(String[] args) {
		System.out.println("if문 전");
		boolean logic = false;
		if(!logic) {
			System.out.println("조건을 만족하면 내가 보임");
		}
		System.out.println("if문 후");
		
		if (logic) {
			System.out.println("조건을 만족");
		}else {
			System.out.println("조건을 불만족");
		}
		
		int num1 = 10, num2 = 20;
		if(num1 < num2) {
			System.out.println("num2가 크다");
		}else {
			System.out.println("num1이 num2보다 크거나 같다");
		}
		
		if(num1 < num2) {
			System.out.println("num2가 크다");
		}else if(num1 == num2){
			System.out.println("num1과 num2는 같다");
		}else {
			System.out.println("num1이 크다");
		}
		
		
	}
	
		

}
