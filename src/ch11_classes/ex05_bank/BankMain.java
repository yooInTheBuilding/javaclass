package ch11_classes.ex05_bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankMain {
    public static void main(String[] args) throws IOException {
        BankService bankService = new BankService();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean run = true;
        while (run){
            System.out.println("-------------------------------------------------------------");
            System.out.println("1.고객등록 2.잔액조회 3.입금 4.출금 5.거래내역확인 6.계좌이체 0.종료");
            System.out.println("-------------------------------------------------------------");
            String select = br.readLine();
            if (select.equals("1")){
                bankService.regist();
            } else if (select.equals("2")) {
                bankService.check();
            } else if (select.equals("3")) {
                bankService.deposit();
            } else if (select.equals("4")) {
                bankService.withdraw();
            } else if (select.equals("5")) {
                bankService.history();
            } else if (select.equals("6")) {
                bankService.transfer();
            } else if (select.equals("0")) {
                System.out.println("종료합니다");
                run = false;
            }
        }
    }
}
