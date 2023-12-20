package ch08_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02_StringEx {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("메세지를 입력하세요");
        System.out.println("프로그램을 종료하려면 '종료'를 입력하세요");

        String s1 = null;
        boolean run = true;
        while(run){
            System.out.print(">");
            s1 = br.readLine();
            System.out.println(s1);
            if(s1.equals("종료")){
                run = false;
            }
        }
    }
}
