package ch10_class.ex9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MemberMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Member member = new Member();
        List<Member> memberList = new ArrayList<Member>();
        boolean runProgram = true;
        boolean runLogin = true;
        boolean runCheck = true;
        int id = 0;
        Member m1;
        String email;
        String pw;
        String select;
        while (runProgram) {
            System.out.println("-----------------------------------------------------");
            System.out.println("[1.회원가입 2.로그인 3.회원 정보 4.종료]");
            System.out.print("숫자입력>>");
            select = br.readLine();
            if (select.equals("1")) {
                member = new Member();
                System.out.println("----------------------회원가입----------------------");
                System.out.print("이메일>>");
                member.setMemberEmail(br.readLine());
                System.out.print("비밀번호>>");
                member.setMemberPassword(br.readLine());
                System.out.print("이름>>");
                member.setMemberName(br.readLine());
                System.out.print("전화번호>>");
                member.setMemberMobile(br.readLine());
                memberList.add(member);
                System.out.println("[회원가입 완료]");
            } else if (select.equals("2")) {
                while (runLogin){
                    System.out.println("-----------------------로그인------------------------");
                    System.out.print("이메일>>");
                    email = br.readLine();
                    System.out.print("비밀번호>>");
                    pw = br.readLine();
                    int i = 0;
                    while (i < memberList.size()){
                        m1 = (Member) memberList.get(i);
                        if (email.equals(m1.getMemberEmail()) && pw.equals(m1.getMemberPassword())){
                            System.out.println("[로그인 성공]");
                            id = i;
                            runLogin = false;
                        }
                        i++;
                    }
                    if (runLogin){
                        System.out.println("[다시 입력하세요]");
                    }
                    i = 0;
                }
            } else if (select.equals("3")) {
                m1 = (Member) memberList.get(id);
                System.out.println("------------------------회원정보------------------------");
                System.out.println("[이메일: " + m1.getMemberEmail() + "]");
                System.out.println("[비밀번호: " + m1.getMemberPassword() + "]");
                System.out.println("[이름: " + m1.getMemberName() + "]");
                System.out.println("[전화번호: " + m1.getMemberMobile() + "]");
            } else if (select.equals("4")) {
                System.out.println("[종료합니다]");
                runProgram = false;
            }
            runLogin = true;
        }

    }

}
