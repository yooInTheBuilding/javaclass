package ch07_while;

public class Ex04_WhileEx {
    public static void main(String[] args) {
        int i = 0;
        while ( i != 6){
            i = (int)((Math.random() * 6) + 1);
            System.out.println(i);
        }
    }
}
