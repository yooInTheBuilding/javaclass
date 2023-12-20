package ch06_for;

import java.io.*;

public class Ex11_ForEx {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String s = "";

        for(int i = 1; i <= N; i++) {
            s += "*";
            bw.write(s + "\n");
        }
        bw.close();
    }
}
