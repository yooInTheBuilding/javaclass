package ch10_class.ex3;

public class Student {
    String studentMajor;
    String studentMobile;
    String studentName;

    public Student() {
        System.out.println("Student 기본생성자");
    }

    public Student(String studentNam){
        System.out.println("name을 매개변수로 하는 생성자");
        System.out.println("studentName = " + studentNam);
    }

    public Student(String studentName, String studentMajor){
        System.out.println("studentName = " + studentName + ", studentMajor = " + studentMajor);
    }

    public Student(String studentName, String studentMajor, String studentMobile){
        System.out.println("studentName = " + studentName + ", studentMajor = " + studentMajor + ", studentMobile = " + studentMobile);
    }
}
