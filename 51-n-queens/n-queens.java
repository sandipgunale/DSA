class Solution {
    static List<List<String>> queens = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        queens = new ArrayList<>();
        int[][] board = new int[n][n];
        solveNQueens(board, 0);
        return queens;
    }
    private void solveNQueens(int[][] board, int r){
        if(r == board.length){
            print(board);
            return;
        }
        for(int c = 0; c < board[0].length; c++){
            if(isSafe(r, c, board)){
                board[r][c] = 1;
                solveNQueens(board, r+1);
                board[r][c] = 0;
            }
        }
    }
    private void print(int[][] board){
        List<String> list = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            String s = "";
            for(int j = 0; j < board[0].length; j++){
                s = s + (board[i][j] == 1 ? "Q" : ".");
                // System.out.print(board[i][j] + " ");
            }
            list.add(s);
            // System.out.println();
        }
        queens.add(list);

    }
    public boolean isSafe(int r, int c, int[][] board){
        int row = r;
        int col = c;
        while(row >= 0 && col < board[0].length){
            if(board[row][col] == 1) return false;
            row--;
        }
        row = r;
        col = c;
        while(row >= 0 && col >= 0){
            if(board[row][col] == 1) return false;
            row--;
            col--;
        }
        row = r;
        col = c;
        while(row >= 0 && col < board[0].length) {
            if (board[row][col] == 1) return false;
            row--;
            col++;
        }
        return true;
    }
}