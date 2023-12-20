package ch10_class.ex8;

public class Student {
    private String studentName;
    private String studentNumber;
    private String studentMajor;
    private String studentMobile;
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public void setStudentNumber(String studentNumber){
        this.studentNumber = studentNumber;
    }
    public void setStudentMajor(String studentMajor){
        this.studentMajor = studentMajor;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }

    public String getStudentName(){
        return studentName;
    }

    public String getStudentNumber(){
        return studentNumber;
    }public String getStudentMajor(){
        return studentMajor;
    }public String getStudentMobile(){
        return studentMobile;
    }


    public Student(){

    }
    public Student(String studentName, String studentNumber, String studentMajor, String studentMobile){
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.studentMajor = studentMajor;
        this.studentMobile = studentMobile;
    }
    public void print(){
        System.out.println(getStudentName());
        System.out.println(getStudentNumber());
        System.out.println(getStudentMajor());
        System.out.println(getStudentMobile());
    }


}
