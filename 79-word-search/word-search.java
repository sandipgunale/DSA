class Solution {
    public boolean exist(char[][] board, String word) {
        int r = board.length;
        int c = board[0].length;
        int[][] bt = new int[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(board[i][j] == word.charAt(0)){
                    boolean check = find(i, j, 0, board, word, bt);
                    if(check) return true;
                }
            }
        }
        return false;
    }



    public boolean find(int r, int c, int idx, char[][] board, String word, int[][] bt){

        if(idx == word.length()) return true;

        if(r < 0 || c < 0 || r == board.length || c == board[0].length || bt[r][c] == 1 || board[r][c] != word.charAt(idx)) return false;

        bt[r][c] = 1;

        boolean u = find(r-1, c, idx+1, board, word, bt);
        boolean d = find(r+1, c, idx+1, board, word, bt);
        boolean l = find(r, c-1, idx+1, board, word, bt);
        boolean ri = find(r, c+1, idx+1, board, word, bt);

        bt[r][c] = 0;

        return u || d || l || ri;
        
    }
}