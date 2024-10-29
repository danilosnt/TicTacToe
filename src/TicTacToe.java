import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        startBoard();

        boolean activeGame = true;
        while (activeGame) {
            displayBoard();
            makeMove(scanner);
            if (checkVictory()) {
                displayBoard();
                System.out.println("Congratulations! The player " + currentPlayer + " won!");
                activeGame = false;
            } else if (checkDraw()) {
                displayBoard();
                System.out.println("The game endend in a draw!");
                activeGame = false;
            } else {
                switchPlayer();
            }
        }

        scanner.close();
    }

    private static void startBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    private static void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void makeMove(Scanner scanner) {
        int row, column;
        boolean validMove = false;

        while (!validMove) {
            System.out.println("Player " + currentPlayer + ", choose a row (0-2) vertically: ");
            row = scanner.nextInt();
            System.out.println("Chosse a column (0-2) horizontally: ");
            column = scanner.nextInt();

            if (row >= 0 && row < 3 && column >= 0 && column < 3 && board[row][column] == '-') {
                board[row][column] = currentPlayer;
                validMove = true;
            } else {
                System.out.println("Invalid position, try again.");
            }
        }
    }

    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    private static boolean checkVictory() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }

        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }

        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }

        return false;
    }

    private static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}