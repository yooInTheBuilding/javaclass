package ch09_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04_ArrayEx {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = {5, 2, 1, 3, 4, 7, 6, 9, 10, 8};
        int var1 = Integer.parseInt(br.readLine());
        for (int i = 0; i < num.length; i++){
            if (var1 == num[i]){
                System.out.println(i);
            }
        }

    }
}
