public class TicTacToe {

    static char[][] board = {
        {'X', 'X', 'X'},
        {'O', '-', 'O'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {
        System.out.println("Has X won? " + hasWon('X'));
        System.out.println("Has O won? " + hasWon('O'));
    }

    static boolean hasWon(char symbol) {

        // Rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol)
                return true;
        }

        // Columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == symbol &&
                board[1][j] == symbol &&
                board[2][j] == symbol)
                return true;
        }

        // Diagonals
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol)
            return true;

        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol)
            return true;

        return false;
    }
}
