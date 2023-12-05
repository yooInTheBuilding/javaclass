package ch05_switch_case;

import java.util.Scanner;

public class Ex02_SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String var = sc.next();

        switch (var){
            case "desk":
                System.out.println("책상");
                break;
            case "chair":
                System.out.println("의자");
                break;
            case "monitor":
                System.out.println("모니터");
                break;
            case "mouse":
                System.out.println("마우스");
                break;
            default:
                System.out.println("사전에 없는 단어");
        }

    }
}
