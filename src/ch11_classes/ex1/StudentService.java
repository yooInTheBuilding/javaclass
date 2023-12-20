package ch11_classes.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

public class StudentService {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StudentRepository studentRepository = new StudentRepository();
    StudentDTO studentDTO = new StudentDTO();
    public void method1(){
        System.out.println("StudentService.method1");
        studentRepository.method1();
    }
    public void method2(){
        System.out.println("StudentService.method2");
        String str1 = "집에 가고 싶다";
        studentRepository.method2(str1);
    }
    public void method3()throws IOException {

        studentDTO = new StudentDTO(br.readLine(), br.readLine(), br.readLine());
        System.out.println("StudentService.method3");
        studentRepository.method3(studentDTO);
    }
    public void method4(){
        List<StudentDTO> studentDTOList = studentRepository.method4();
        for (StudentDTO studentDTO: studentDTOList
             ) {
            System.out.println("studentDTO = " + studentDTO);
        }
    }
    public void method5()throws IOException{
        Long id = Long.parseLong(br.readLine());
        StudentDTO studentDTO1 = studentRepository.method5(id);
        if (studentDTO1 != null){
        System.out.println("studentDTO1 = " + studentDTO1);
        }else {
            System.out.println("정보없음");
        }
    }
}
