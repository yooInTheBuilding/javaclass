package ch09_array;

public class Ex07_ArrayEx {
    public static void main(String[] args) {
        int[] number = {3, 2, 1, 5, 4};
        int[] arr1 = new int[number.length];
        int[] min = new int[number.length];
        int max = number[0];
        for (int i = 0; i < number.length; i++){
            if (max > number[i]){
                max = number[i];
            }
        }
        for (int i = 0; i < number.length; i++){
            min[i] = max;
        }
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < number.length; j++){
                if (i == 0){
                    if ( min[i]> number[j]){
                        min[i] = number[j];
                    }
                }else {
                    if(min[i] > number[j] && number[j] > arr1[i]){
                        min[i] = number[j];
                    }
                }
            }
            arr1[i] = min[i];
        }
        for (int i = 0; i < number.length; i++){
            System.out.println(arr1[i]);
        }
    }
}
