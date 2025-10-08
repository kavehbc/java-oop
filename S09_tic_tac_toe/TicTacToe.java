package S09_tic_tac_toe;
import S05_user_inputs.Terminal;
import java.util.Scanner;

public class TicTacToe {

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                if (j < board[i].length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < board.length - 1) {
                System.out.println("---------");
            }
        }
    }

    public static char switchPlayer(char currentPlayer) {

        /*
         * if (currentPlayer == 'X') {
         * return 'O';
         * } else {
         * return 'X';
         * }
         */
        return (currentPlayer == 'X') ? 'O' : 'X';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char currentPlayer = 'X';
        // Implementation of Tic Tac Toe game will go here
        boolean isDraw = true;

        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        for (int turn = 0; turn < 9; turn++) {
            Terminal.clear();

            System.out.println("Tic Tac Toe Game");
            System.out.println();
            printBoard(board);
            System.out.println();

            System.out.println("Player: " + currentPlayer + " - Enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row < 1 || row > 3 || col < 1 || col > 3 || board[row - 1][col - 1] != ' ') {
                System.out.println("Invalid move. Try again.");
                turn--;
                continue;
            }
            board[row - 1][col - 1] = currentPlayer;
            // check for win condition can be added here
            if (checkWinner(board, currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                isDraw = false;
                printBoard(board);
                break;
            }
            currentPlayer = switchPlayer(currentPlayer);
    
        }

        if (isDraw) {
            System.out.println("It's a draw! There is no winner.");
            printBoard(board);
        }

        scanner.close();
    }

    public static boolean checkWinner(char[][] board, char player) {
        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < 3; i++) {
            // checking rows and columns
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        // checking diagonals
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }
    

}
