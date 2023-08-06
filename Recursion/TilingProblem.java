package Recursions;

public class TilingProblem {

    public static int tiling(int n){  //2 x (n) floor size & tile size = (2x1)
        if (n == 0 || n == 1){
            return 1;
        }
        int vw = tiling(n-1);
        int hw = tiling(n-2);
        return vw + hw;
    }
    public static void main(String[] args) {
        System.out.println(tiling(5));
    }
}
