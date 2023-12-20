package ch07_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex08_WhileEx {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int var1;
        int var2;
        int acount = 0;

        do{
            System.out.println("------------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
            System.out.println("------------------------------------");
            System.out.print("선택>");
            var1 = Integer.parseInt(br.readLine());
            if (var1 == 1) {
                System.out.print("예금액>");
                var2 = Integer.parseInt(br.readLine());
                acount += var2;
                System.out.println("현재 잔액은 " + acount + "입니다");
            }else if (var1 == 2){
                System.out.print("출금액>");
                var2 = Integer.parseInt(br.readLine());
                if (acount < var2){
                    System.out.println("잔고가 부족합니다");
                    System.out.println("현재 잔액은 " + acount + "입니다");
                }else {
                    acount -= var2;
                    System.out.println("현재 잔액은 " + acount + "입니다");
                }

            } else if (var1 == 3) {
                System.out.println("현재 잔액은 " + acount + "입니다");
            } else if (var1 == 4) {
                System.out.println("종료합니다");
                break;
            }

        }while(true);
    }

}
