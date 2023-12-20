package ch07_while;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05_WhileEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int var1 = (int)(Math.random() * 100) + 1;
        System.out.println(var1);
        int var2 = 0;
        int check = 0;
        while(var1 != var2){
            var2 = Integer.parseInt(br.readLine());
            check++;
        }
        System.out.println("정답: " + var1);
        System.out.println("횟수: " + check);

    }
}
