package ch11_classes.ex1;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private static List<StudentDTO> studentDTOList = new ArrayList<>();
    public void method1(){
        System.out.println("StudentService.method1");
    }
    public void method2(String str){
        System.out.println("str = " + str);
    }
    public boolean method3(StudentDTO studentDTO){
        boolean a = studentDTOList.add(studentDTO);
        System.out.println(studentDTOList.get(studentDTOList.size() - 1).getStudentName());
        System.out.println(studentDTOList.get(studentDTOList.size() - 1).getStudentMajor());
        System.out.println(studentDTOList.get(studentDTOList.size() - 1).getStudentMobile());
       return a;

    }
    public List<StudentDTO> method4(){
        return studentDTOList;
    }
    public StudentDTO method5(Long id){
        StudentDTO studentDTO = new StudentDTO();
        for (int i = 0; i < studentDTOList.size(); i++){
            if (id.equals(studentDTOList.get(i).getId())){
                studentDTO = studentDTOList.get(i);
            }
        }
        return studentDTO;
    }
}
