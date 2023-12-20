package ch10_class.ex2;

public class StudentMain {
    public static void main(String[] args) {
        //Student class 객체 선언
        Student student1 = new Student();
        //Student class 의 필드에 값 저장
        student1.studentName = "학생1";
        student1.studentMajor = "컴퓨터공학";
        student1.studentMobile = "010-1111-1111";

        Student student2 = new Student();
        student2.studentName = "학생2";
        student2.studentMajor = "경영학";
        student2.studentMobile = "010-2222-2222";
    }
}
