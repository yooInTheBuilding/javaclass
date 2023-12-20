package ch10_class.ex6;

public class Calculator {
    public void sum(int x, int y){
        System.out.println("= " + (x + y));
    }
    public void sub(int x, int y){
            System.out.println("= " + (x - y));
    }
    public void mul(int x, int y){
        System.out.println("= " + (x * y));
    }
    public void div(int x, int y){
            System.out.println("= " + ((double)x / (double) y));
    }
}
