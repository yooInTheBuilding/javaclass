package ch10_class.ex4;

public class Student {
    String studentName;
    String studentNumber;
    String studentMajor;

    public Student(){
        System.out.println("Student.Student");
    }
    public Student(String studentName, String studentNumber, String studentMajor){
        System.out.println("studentName = " + studentName + ", studentNumber = " + studentNumber + ", studentMajor = " + studentMajor);
        //전달받은 매개변수 값을 필드에 담기
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.studentMajor = studentMajor;
    }
}
