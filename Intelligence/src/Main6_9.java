import java.util.*;
public class Main6_9 {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
        char currentPlayer = 'X';
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBoard(board);
            System.out.println("Player " + currentPlayer + "'s turn:");
            int row, col;
            do {
                System.out.print("Enter row (1-3): ");
                row = scanner.nextInt()-1;
                System.out.print("Enter column (1-3): ");
                col = scanner.nextInt()-1;
            } while (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ');
            board[row][col] = currentPlayer;
            if (checkWin(board, currentPlayer)) {
                printBoard(board);
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }
            if (isBoardFull(board)) {
                printBoard(board);
                System.out.println("It's a tie!");
                break;
            }
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }
    private static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + board[i][j] + " |");
            }
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print("----");
            }System.out.println("-");
        }
    }
    private static boolean checkWin(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
    private static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}