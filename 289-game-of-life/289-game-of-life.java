class Solution {
    public void gameOfLife(int[][] board) {
        int[][] direction = new int[][]{{0,1},{1,0},{0,-1},{-1,0},{1,1},{-1,1},{-1,-1},{1,-1}};
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                int numOfLiveCells = 0;
                for(int[] dir : direction){
                    int x = i + dir[0];
                    int y = j + dir[1];
                    if(x >= 0 && x < board.length && y >= 0 && y<board[0].length && Math.abs(board[x][y]) == 1){
                        numOfLiveCells++;
                    }
                }
                if(board[i][j] == 0){
                    if(numOfLiveCells == 3) board[i][j] = Integer.MAX_VALUE;
                }else{
                    if(numOfLiveCells < 2 || numOfLiveCells > 3) board[i][j] = -1;
                }
            }
        }
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                if(board[i][j] == -1) board[i][j] = 0;
                if(board[i][j] == Integer.MAX_VALUE) board[i][j] = 1;
            }
        }
    }
}