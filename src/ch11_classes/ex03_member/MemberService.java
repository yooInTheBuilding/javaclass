package ch11_classes.ex03_member;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

public class MemberService {
    public static String logInEmail = null;
    MemberRepository memberRepository = new MemberRepository();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void signUp() throws IOException {
        System.out.println("------------------회원가입-----------------");
        System.out.print("이메일>");
        String newMemberEmail = br.readLine();
        boolean check = memberRepository.duplication(newMemberEmail);
        if (check){
            System.out.println("사용중인 이메일입니다");
            signUp();
        }else {
            System.out.print("비밀번호>");
            String newMemberPw = br.readLine();
            System.out.print("이름>");
            String newMemberName = br.readLine();
            System.out.print("전화번호>");
            String newMemberMobile = br.readLine();
            MemberDTO memberDTO = new MemberDTO(newMemberEmail, newMemberPw, newMemberName, newMemberMobile);
            boolean bool = memberRepository.signUp(memberDTO);
            if (bool) {
                System.out.println("회원가입 성공");
            } else {
                System.out.println("회원가입 실패");
            }
        }
    }

    public void logIn() throws IOException{
        if (logInEmail != null){
            System.out.println("이미 로그인 되어있습니다.\n로그아웃 후 이용해주세요");
        }else {
            System.out.println("-----------------로그인--------------------");
            System.out.print("이메일>");
            String email = br.readLine();
            System.out.println("비밀번호>");
            String pw = br.readLine();
            boolean bool = memberRepository.logIn(email, pw);
            if (bool) {
                logInEmail = email;
            }
        }
    }

    public void check() {
        System.out.println("---------------회원목록조회------------------");
        List<MemberDTO> memberDTOList = memberRepository.check();
        for (MemberDTO memberDTO : memberDTOList){
            System.out.println(memberDTO.toString());
        }
    }

    public void modify() throws IOException{
        if (logInEmail == null){
            System.out.println("먼저 로그인하세요");
        }else {
            System.out.println("----------전화번호수정------------------");
            System.out.print("새로운 전화번호>");
            String newMobile = br.readLine();
            boolean bool = memberRepository.modify(logInEmail, newMobile);
            if (bool){
                System.out.println("수정 완료되었습니다");
            }else {
                System.out.println("수정실패");
            }
        }
    }

    public void cancel() throws IOException{
        if (logInEmail == null){
            System.out.println("먼저 로그인하세요");
        }else {
            System.out.println("---------------회원탈퇴--------------------");
            System.out.print("비밀번호 확인>");
            String pw = br.readLine();
            boolean bool = memberRepository.cancel(logInEmail, pw);
            if (bool){
                System.out.println("탈퇴 완료");
                logInEmail = null;
            }else {
                System.out.println("일치하지 않습니다");
            }
        }
    }

    public void logOut() {
        logInEmail = null;
        System.out.println("로그아웃 완료");
    }

    public static String getLogInEmail() {
        return logInEmail;
    }
}
