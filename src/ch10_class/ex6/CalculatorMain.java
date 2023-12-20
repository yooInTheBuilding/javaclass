package ch10_class.ex6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CalculatorMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Calculator calculator1 = new Calculator();
        boolean run = true;
        int x;
        String arith;
        int y;
        String s1;
        while (run){
            System.out.println("덧셈: + 뺄셈: - 곱셈: * 나눗셈: / 종료: 종료입력");
            s1 = br.readLine();
            if (s1.equals("종료")){
                run = false;
            }else {
                st = new StringTokenizer(s1, "+-*/", true);
                x = Integer.parseInt(st.nextToken());
                arith = st.nextToken();
                y = Integer.parseInt(st.nextToken());
                if (arith.equals("+")) {
                    calculator1.sum(x, y);
                } else if (arith.equals("-")) {
                    calculator1.sub(x, y);
                } else if (arith.equals("*")) {
                    calculator1.mul(x, y);
                } else if (arith.equals("/")) {
                    calculator1.div(x, y);
                }
            }
        }
    }
}
