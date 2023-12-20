package ch09_array;

public class Ex02_ArrayBasic {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println(sum);
        System.out.println(sum / numbers.length);

    }
}
