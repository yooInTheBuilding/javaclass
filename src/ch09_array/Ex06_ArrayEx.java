package ch09_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06_ArrayEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }
        int max = arr1[0];
        for (int i = 0; i < arr1.length; i++){
            if (max < arr1[i]){
                max = arr1[i];
            }
        }
        System.out.println(max);

    }
}
