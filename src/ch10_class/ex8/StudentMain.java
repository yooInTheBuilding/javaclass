package ch10_class.ex8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Student student1 = new Student();
        System.out.print("학생이름: ");
        student1.setStudentName(br.readLine());
        System.out.print("학번: ");
        student1.setStudentNumber(br.readLine());
        System.out.print("전공: ");
        student1.setStudentMajor(br.readLine());
        System.out.print("전화번호: ");
        student1.setStudentMobile(br.readLine());

        student1.print();
    }
}
