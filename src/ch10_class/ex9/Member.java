package ch10_class.ex9;

public class Member {
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private String memberMobile;







    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMemberMobile() {
        return memberMobile;
    }
    public Member(){

    }
    public Member(String memberEmail, String memberPassword, String memberName, String memberMobile){
        setMemberEmail(memberEmail);
        setMemberPassword(memberPassword);
        setMemberName(memberName);
        setMemberMobile(memberMobile);
    }
    public boolean memberLogin(String memberEmail, String memberPassword){
        if (this.memberEmail.equals(memberEmail) && this.memberPassword.equals(memberPassword)){
            return true;
        }else {
            return false;
        }
    }
}
