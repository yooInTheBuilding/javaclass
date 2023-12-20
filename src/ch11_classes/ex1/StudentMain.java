package ch11_classes.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean run = true;
        int select;
        StudentService studentService = new StudentService();
        while(run) {
            System.out.println("------------------------------------------------------------");
            System.out.println("1.method1 호출 | 2.method2 호출 | 3.method3 호출 | 4.종료");
            System.out.println("------------------------------------------------------------");
            System.out.print("선택>");
            select = Integer.parseInt(br.readLine());
            if (select == 1){
                studentService.method1();
            } else if (select == 2) {
                studentService.method2();
            } else if (select == 3) {
                studentService.method3();
            } else if (select == 4) {
                studentService.method4();
            } else if (select == 5) {
                studentService.method5();
            } else if (select == 6) {
                run = false;
            }
        }
    }
}
