package ch10_class.ex3;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentName = "다라";

        Student student2 = new Student("이름1");
        student2.studentName = "가나";
        student2.studentName = "마바";
        student2 = new Student(student2.studentName);
        Student student3 = new Student(student2.studentName, "대충전공");

        Student student4 = new Student("이름3", "전공1", "전번1");

    }
}
