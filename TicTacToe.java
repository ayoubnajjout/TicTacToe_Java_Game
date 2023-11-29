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

    public boolean isGameOver(){
        for (int i = 0; i < ROWS; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2]) && !board[i][0].matches(regex)) {
                return true;
            }
        }
        return false;
    }
}
