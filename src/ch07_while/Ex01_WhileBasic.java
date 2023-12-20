package ch07_while;

public class Ex01_WhileBasic {
    public static void main(String[] args) {
       int i = 1;
        while(i <= 3){
            System.out.println("i = " + i);
            i++;
        }

        int j = 1;
        do{
            System.out.println("j = " + j);
            j++;
        }while(j <= 3);
        System.out.println("do while 종료후 j = " + j);
    }
}
