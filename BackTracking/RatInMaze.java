package BackTracking;

public class RatInMaze {
    public static int mazeSol(int maze[][], int i, int j, int n){
        if(i == n-1 && j == n-1){
            return 1;
        }else if(i == n || j == n){
            return 0;
        }
        if(maze[i][j] == 1){
            return mazeSol(maze, i+1, j, n) + mazeSol(maze, i, j+1, n);
        }
        return 0;
    }
    public static void printMaze(int[][] maze){
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] maze  = {{1,1,1,0},
        {1,0,0,1},
        {0,1,0,1},
        {1,1,1,1}};
        int n = maze.length;
        System.out.println(mazeSol(maze, 0, 0, n));
        printMaze(maze);
        
    }
}
