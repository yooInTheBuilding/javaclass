package ch11_classes.ex05_bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankService {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BankRepository bankRepository = new BankRepository();
    public void regist() throws IOException {
        System.out.print("계좌번호: ");
        String account = br.readLine();
        boolean bool = bankRepository.acCheck(account);
        if (bool){
            System.out.println("이미 사용 중인 계좌번호입니다");
            regist();
        }else {
            System.out.println("사용 가능한 계좌번호입니다");
            System.out.print("비밀번호: ");
            String password = br.readLine();
            System.out.print("이름: ");
            String name = br.readLine();
            BankDTO bankDTO = new BankDTO(account, password, name, 0L);
            bankRepository.regist(bankDTO);
            System.out.println("고객등록 성공");
        }
    }

    public void check() throws IOException{
        System.out.print("계좌번호: ");
        String account = br.readLine();
        System.out.println(bankRepository.check(account));
    }

    public void deposit() throws IOException{
        System.out.print("계좌번호: ");
        String account = br.readLine();
        System.out.print("입금액: ");
        Long deposit = Long.parseLong(br.readLine());
        boolean bool = bankRepository.deposit(account, deposit);
        if (bool){
            System.out.println("입금완료");
        }else {
            System.out.println("해당 계좌가 없습니다");
        }
    }

    public void withdraw() throws IOException{
        System.out.print("계좌번호: ");
        String account = br.readLine();
        System.out.print("비밀번호: ");
        String password = br.readLine();
        boolean bool = bankRepository.wdCheck(account, password);
        if (bool){
            System.out.print("출금액: ");
            Long withdraw = Long.parseLong(br.readLine());
            System.out.println(bankRepository.withdraw(account, withdraw));
        }else {
            System.out.println("계좌번호 혹은 비밀번호가 틀렸습니다");
            withdraw();
        }
    }

    public void history() throws IOException{
        System.out.print("계좌번호: ");
        String account = br.readLine();
        boolean run = true;
        while (run) {
            StringBuilder sb = new StringBuilder();
            System.out.println("---------------------------------------------------");
            System.out.println("1.모든내역 2.입금내역 3.출금내역 4.종료");
            String select = br.readLine();
            if (select.equals("1")) {
                sb = bankRepository.historyAll(account);
            } else if (select.equals("2")) {
                sb = bankRepository.historyDep(account);
            } else if (select.equals("3")) {
                sb = bankRepository.historyWit(account);
            } else if (select.equals("4")) {
                System.out.println("거래내역확인을 종료합니다");
                run = false;
            }
            System.out.println(sb);
        }
    }

    public void transfer() throws IOException{
        System.out.print("보내시는 분 계좌번호: ");
        String accountSend = br.readLine();
        System.out.print("받으시는 분 계좌번호: ");
        String accountRece = br.readLine();
        System.out.print("보낼 금액: ");
        Long transfer = Long.parseLong(br.readLine());
        System.out.println(bankRepository.transferCheck(accountRece));
        System.out.println("맞으면 1번 틀리면 2번을 입력해주세요");
        System.out.print("입력>");
        String s1 = br.readLine();
        if (s1.equals("1")){
            System.out.print("비밀번호를 입력해주세요: ");
            String password = br.readLine();
            System.out.println(bankRepository.transfer(accountSend, accountRece, transfer));
        }
    }
}
