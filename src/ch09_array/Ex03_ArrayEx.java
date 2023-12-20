package ch09_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03_ArrayEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        int[] arr1 = new int[3];
        for (int i =0; i < arr1.length; i++){
            arr1[i] = Integer.parseInt(br.readLine());
            sum += arr1[i];
        }
        System.out.println(sum);
        System.out.println(sum / arr1.length);


    }
}
