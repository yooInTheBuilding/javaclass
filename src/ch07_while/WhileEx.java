package ch07_while;

public class WhileEx {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int sum = 0;
        while(sum != 100){
            i++;
            j--;
            System.out.println(i + " " + j);
            if (i % 2 == 1){
                sum += i;
            }else{
                sum += j;
            }
            System.out.println(sum);
        }
    }
}
