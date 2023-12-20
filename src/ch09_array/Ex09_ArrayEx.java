package ch09_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex09_ArrayEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean run = true;
        int select;
        int num;
        int[] arr1 = new int[0];
        int[] arrSort = new int[0];
        int check = 0;
        int max = 0;
        double avg = 0;
        while(run) {
            System.out.println("------------------------------------------------------------");
            System.out.println("1.학생수입력 | 2.점수입력 | 3.점수목록 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------------------");
            System.out.print("선택>");
            select = Integer.parseInt(br.readLine());

            if (select == 1){
                System.out.print("학생수>");
                num = Integer.parseInt(br.readLine());
                arr1 = new int[num];
                arrSort = new int[num];
                check++;
            } else if (select == 2) {
                if (check == 0){
                    System.out.println("학생수를 먼저 입력하세요");
                }else {
                    for (int i = 0; i < arr1.length; i++){
                        System.out.print((i+1) + "번 학생 점수: ");
                        arr1[i] = Integer.parseInt(br.readLine());
                        arrSort[i] = arr1[i];
                    }
                    Arrays.sort(arrSort);
                }
            } else if (select == 3) {
                if (check == 0){
                    System.out.println("학생수를 먼저 입력하세요");
                }else {
                    for (int i = 0; i < arr1.length; i++) {
                        System.out.println((i + 1) + "번 학생 점수: " + arr1[i]);
                    }
                }
            } else if (select == 4) {
                if (check == 0){
                    System.out.println("학생수를 먼저 입력하세요");
                }else {
                    for (int i = 0; i < arr1.length; i++){
                        if (max < arr1[i]){
                            max = arr1[i];
                        }
                        avg += ((double) arr1[i])/ (double) arr1.length;
                    }
                    System.out.println("최고점수: " + max);
                    System.out.println("평균점수: " + avg);
                    for (int i = 0; i < arrSort.length; i++){
                        System.out.println((i+1) + "등: " + arrSort[arrSort.length -i-1]);
                    }
                    avg = 0;
                    max = 0;

                }
            } else if (select == 5) {
                System.out.println("종료합니다");
                run = false;
            }
        }

    }
}
