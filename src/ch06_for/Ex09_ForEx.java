package ch06_for;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex09_ForEx {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String s1 = br.readLine();
        st = new StringTokenizer(s1);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = 0;
        int y = 0;
        boolean check = false;
        for (int i = n; i <= m; i++){
            check = false;
            x = i;
            if((60-4*x) % 5 == 0){
                y = (60-4*x)/5;
                check = true;
            }
            if (y > m || y < n){
                check = false;
            }


            if(check) {
                System.out.println(x + ", " + y);
            }
        }
    }
}
