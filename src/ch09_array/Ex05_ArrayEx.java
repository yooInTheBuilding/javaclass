package ch09_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05_ArrayEx {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int var1 = Integer.parseInt(br.readLine());
        int[] coin = {500, 100, 50, 10};
        int[] cointCount = new int[coin.length];
        boolean run = true;
        for(int i = 0; i < coin.length; i++){
            while (var1 >= coin[i]){
                var1 -= coin[i];
                cointCount[i]++;
            }
        }
        for (int i = 0; i < coin.length; i++){
            System.out.println(cointCount[i]);
        }
    }
}

