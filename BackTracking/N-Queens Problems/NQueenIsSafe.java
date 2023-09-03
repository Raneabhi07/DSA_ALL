
public class NQueenIsSafe {

    //This method is to find and print all solution possible
    public static void nQueens(char[][] board, int row){
        //base case
        if(row == board.length){
            //To print the count of the no. of solution we print count variable
            count++;
            printBoard(board);
            return;
        }
        //work
        for(int j=0; j < board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueens(board, row+1);
                board[row][j] = 'x';
            }
        }
    }

    static int count = 0;

    //This method is to print one solution only

    // public static boolean nQueens(char[][] board, int row){
    //     //base case
    //     if(row == board.length){
    //         printBoard(board);
    //         return true;
    //     }
    //     //work
    //     for(int j=0;j<board.length;j++){
    //         if(isSafe(board, row, j)){
    //             board[row][j] = 'Q';
    //             if(nQueens(board, row+1)){
    //                 return true;
    //             }
    //             board[row][j] = 'x';
    //         }
    //     }
    //     return false;
    // }

    public static boolean isSafe(char[][] board, int row, int col){
        //check vertically --> row-1, col is same 
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //check diagonally left side --> row-1, col-1
        for(int i=row-1, j=col-1;i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // check diagonally right side --> row-1, col+1
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char[][] board){
        System.out.println("---------chess board---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
        System.out.println("Total count of all possible solution are: " + count);
    }
}
