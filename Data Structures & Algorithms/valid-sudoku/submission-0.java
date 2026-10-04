class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = board[0].length;

        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == '.') {
                    continue;
                }

                int index = board[i][j] - '1';
                int boxNumber = (i / 3) * 3 + (j / 3);
                
                if (row[i][index] == true || col[j][index] == true || box[boxNumber][index] == true) {
                    return false;
                }

                row[i][index] = true;
                col[j][index] = true;
                box[boxNumber][index] = true;
            }
        }

        return true;
    }
}
