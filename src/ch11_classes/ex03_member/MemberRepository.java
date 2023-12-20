package ch11_classes.ex03_member;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    public static List<MemberDTO> memberDTOList = new ArrayList<MemberDTO>();
    public boolean signUp(MemberDTO memberDTO) {
        return memberDTOList.add(memberDTO);
    }

    public boolean logIn(String email, String pw) {
        boolean bool = false;
        for (int i = 0; i < memberDTOList.size(); i++){
            if (email.equals(memberDTOList.get(i).getMemberEmail()) && pw.equals(memberDTOList.get(i).getMemberPassword())){
                bool = true;
            }
        }
        return bool;
    }

    public List<MemberDTO> check() {
        return memberDTOList;
    }

    public boolean modify(String logInEmail,  String newMobile) {
        boolean bool = false;
        for (int i = 0; i < memberDTOList.size(); i++){
            if (memberDTOList.get(i).getMemberEmail().equals(logInEmail)){
                memberDTOList.get(i).setMemberMobile(newMobile);
                bool = true;
            }
        }
        return bool;
    }

    public boolean cancel(String logInEmail, String pw) {
        boolean bool = false;
        for (int i = 0; i < memberDTOList.size(); i++){
            if (memberDTOList.get(i).getMemberEmail().equals(logInEmail)
                    && memberDTOList.get(i).getMemberPassword().equals(pw)){
                 memberDTOList.remove(i);
                 bool = true;
            }
        }
        return bool;
    }

    public boolean duplication(String newMemberEmail) {
        boolean bool = false;
        for (int i = 0; i < memberDTOList.size(); i++){
            if (memberDTOList.get(i).getMemberEmail().equals(newMemberEmail)){
                bool = true;
            }
        }
        return bool;
    }
}
