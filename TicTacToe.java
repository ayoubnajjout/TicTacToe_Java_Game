public class TicTacToe {
    private String[][] board;
    private static final int ROWS = 3;
    private static final int COLS = 3;
    private String regex = "\\s{3}";

    TicTacToe() {
        this.board = new String[ROWS][COLS];
        boardDeploy();
    }

    public void boardDeploy() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                this.board[i][j] = "   ";
            }
        }
    }

    public String displayBoard() {
        String strBoard = "";
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (j!=ROWS-1){
                strBoard+=this.board[i][j]+"|";
            }
                else {
                    strBoard+=this.board[i][j];
                }
            }
            if (i!=ROWS-1){
            strBoard+="\n---+---+---\n";
        }
        }
        return strBoard;
    }

    public void setPlayer(int x,int y,String player){
        if(this.board[x][y].matches(regex)){
            board[x][y] = " "+player+" ";
        }
    }

    public boolean isGameOver() {
        // Check rows for a win
        for (int i = 0; i < ROWS; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2]) && !board[i][0].matches(regex)) {
                return true; // A row has the same symbols and is not empty
            }
        }

        // Check columns for a win
        for (int j = 0; j < COLS; j++) {
            if (board[0][j].equals(board[1][j]) && board[0][j].equals(board[2][j]) && !board[0][j].matches(regex)) {
                return true; // A column has the same symbols and is not empty
            }
        }

        // Check diagonals for a win
        if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]) && !board[0][0].matches(regex)) {
            return true;
        }
        if (board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]) && !board[0][2].matches(regex)) {
            return true;
        }

        boolean isFull = true;
        for (String[] row : board) {
            for (String cell : row) {
                if (cell.matches(regex)) {
                    isFull = false;
                    break;
                }
            }
            if (!isFull) {
                break;
            }
        }
        if (isFull) {
            return true;
        }

        return false;
    }

}
