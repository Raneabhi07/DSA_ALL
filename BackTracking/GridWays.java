package BackTracking;

public class GridWays {

    public static int gridWays(int i, int j, int m, int n){   //O(2^(M+N))
        //base case
        if(i == m-1 && j == n-1){
            return 1;
        }else if(i == m || j == n){
            return 0;
        }
        //recursion
        return gridWays(i+1, j, m, n) + gridWays(i, j+1, m, n);
    }

    public static int gridWaysSol2(int i, int j, int m, int n, int[][] dp){   //dynamic programming approach
        //base case
        if(i == m-1 && j == n-1){
            return 1;
        }else if(i == m || j == n){
            return 0;
        }
        //recursion
        if(dp[i][j] != -1){
            return dp[i][j];
        }else{
            return gridWaysSol2(i+1, j, m, n, dp) + gridWaysSol2(i, j+1, m, n, dp);
        }
    }

    public static int gridWaysOptimized(int m, int n){
        int N = m+n-2;
        int r = m-1;
        double res = 1;
        for(int i=1;i<=r;i++){
            res = res*(N-r+i)/i;  
        }
        return (int)res;
    }
    public static void main(String[] args) {
        int m = 3, n = 3;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for (int j = 0; j <n; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(gridWays(0, 0, m, n));
        System.out.println(gridWaysSol2(0, 0, m, n, dp));
        System.out.println(gridWaysOptimized(m, n));

    }
}
