package ch11_classes.ex03_member;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MemberMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MemberService memberService = new MemberService();
        boolean run = true;
        String s1;
        while (run){
            String loginEmail = MemberService.getLogInEmail();
            System.out.println("--------------------------------------------------- 현재계정: " + loginEmail );
            System.out.println("1.회원가입 2.로그인 3.회원목록조회 4.회원정보수정 5.회원탈퇴 6.로그아웃 7.종료");
            System.out.println("--------------------------------------------------------------------");
            System.out.print("선택>");
            s1 = br.readLine();
            if (s1.equals("1")){
                memberService.signUp();
            } else if (s1.equals("2")) {
                memberService.logIn();
            } else if (s1.equals("3")) {
                memberService.check();
            } else if (s1.equals("4")) {
                memberService.modify();
            } else if (s1.equals("5")) {
                memberService.cancel();
            } else if (s1.equals("6")) {
                memberService.logOut();
            } else if (s1.equals("7")) {
                System.out.println("종료합니다");
                run = false;
            }
        }
    }
}
