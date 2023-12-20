package ch07_while;

public class Ex02_WhileEx {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        String s1 = "";
        while (i <= 10){
            sum += i;
            if(i == 10){
                s1 += (i);
            }else{
                s1 += (i + " + ");
            }
            i++;
        }

        System.out.println(s1 + " = " + sum);
    }
}
