package ch06_for;

public class Ex07_NestedFor {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                System.out.print(i + " * " + j + " = " + (i*j) + "  ");
            }
            System.out.println("");
        }
    }
}
