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
        Terminal.clear();
        Scanner scanner = new Scanner(System.in);

        char currentPlayer = 'X';
        System.out.println("Tic Tac Toe Game");
        // Implementation of Tic Tac Toe game will go here

        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        printBoard(board);

        for (int turn = 0; turn < 9; turn++) {
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
            currentPlayer = switchPlayer(currentPlayer);
            printBoard(board);
        }

        scanner.close();
    }

    

}
