import java.util.Scanner;

public class TicTacToe {

    static char[][] board = new char[3][3];
    static boolean isPlayerXTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initializeBoard();

        while (!gameOver) {
            printBoard();

            if (isPlayerXTurn) {
                System.out.println("Player X turn (row col): ");
                int r = sc.nextInt();
                int c = sc.nextInt();
                board[r][c] = 'X';
            } else {
                System.out.println("Player O turn (row col): ");
                int r = sc.nextInt();
                int c = sc.nextInt();
                board[r][c] = 'O';
            }

            // Only loop + turn switching (NO win/draw logic here)
            isPlayerXTurn = !isPlayerXTurn;
        }

        sc.close();
    }

    static void initializeBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = '-';
    }

    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }
}