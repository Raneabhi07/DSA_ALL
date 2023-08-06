package Recursions;

public class PrintIncrease {
    public static void PIncrese(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        PIncrese(n-1);
        System.out.println(n + " ");
    }
    public static void main(String[] args) {
        int n =10;
        PIncrese(n);
    }
}

