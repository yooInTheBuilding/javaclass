package ch07_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex06_WhileEx {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String s1;
        int var1;
        int var2;
        System.out.println("정수를 입력하고 마지막에 0을 입력하세요");
        s1 = br.readLine();
        st = new StringTokenizer(s1);
        double sum = 0;
        int div = st.countTokens();
        while (st.hasMoreTokens()){
            sum += Integer.parseInt(st.nextToken());
        }
        System.out.println("입력한 숫자는" + (div -1) + "개 입니다");
        System.out.println(sum/(div - 1));

    }
}
