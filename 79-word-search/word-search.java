class Solution {
    public boolean exist(char[][] board, String word) {
     int row = board.length;
        int col = board[0].length;
        boolean[][] visited = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(board[i][j] == word.charAt(0) && find(i, j, 0, word, board, visited)){
                    visited[i][j] = true;
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean find(int r, int c, int idx, String word, char[][] board, boolean[][] visited){
        if(idx == word.length()){
            return true;
        }
        if(r >= board.length ||  c >= board[0].length || r < 0 || c < 0 || board[r][c] != word.charAt(idx)) return false;

        if(visited[r][c]) return false;
        visited[r][c] = true;
        boolean result = find(r + 1, c, idx + 1, word, board, visited) ||
                find(r - 1, c, idx + 1, word, board, visited) ||
                find(r, c + 1, idx + 1, word, board, visited) ||
                find(r, c - 1, idx + 1, word, board, visited);
        visited[r][c] = false;
        return result;
    }
}