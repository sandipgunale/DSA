class Solution {
    public int numIslands(char[][] grid) {
    if(grid == null || grid.length == 0) return 0;
        int row = grid.length;
        int col = grid[0].length;
        int islands = 0;
        for(int r = 0; r < row; r++){
            for(int c = 0; c < col; c++){
                if(grid[r][c] == '1'){
                    islands++;
                    backtrack(grid, r, c, row, col);
                }
            }
        }
        return islands;
    }
    public static void backtrack(char[][] grid, int r, int c, int row, int col){
        if(r < 0 || r >= row || c < 0 || c >= col){
            return;
        }
        if(grid[r][c] == '0'){
            return;
        }
        grid[r][c] = '0';
        backtrack(grid, r ,c + 1, row, col);
        backtrack(grid, r, c - 1, row, col);
        backtrack(grid, r + 1, c, row, col);
        backtrack(grid, r - 1, c, row, col);

    }
}