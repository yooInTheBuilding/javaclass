package ch10_class.ex4;

public class StudentMain {
    public static void main(String[] args) {
        Student student1;
        Student student2;
        student1 = new Student();
        student1.studentName = "학생1";
        student1.studentNumber = "23131";
        student1.studentMajor = "대충 전공";
        student2 = new Student("이름", "학번", "전공");
        System.out.println(student2.studentName);


    }
}
