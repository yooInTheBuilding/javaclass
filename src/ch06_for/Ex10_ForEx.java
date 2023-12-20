package ch06_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10_ForEx {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int var1 = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 1; i <= var1; i++){
            if(i%2 != 0 && i%3 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
