package ch07_while;

public class Ex07_WhileEX {
    public static void main(String[] args) {
        int sum = 0;
        int var1 = 1;
        int check = 1;
        while (sum != 100){
            System.out.println("var1: " + var1);
            sum += var1;
            if (check % 2 == 1){
                var1 = - var1 - 1;
            }else {
                var1 = - var1 + 1;
            }
            System.out.println("sum: " + sum);
            check++;
        }
    }
}
