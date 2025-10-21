import java.util.Random;
import java.util.Scanner;

public class TicTacToeWithComputer {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        boolean playerTurn = true;
        boolean gameEnded = false;

        while (!gameEnded) {
            printBoard(board);

            if (playerTurn) {
                System.out.println("Player's turn");
                int row = -1, col = -1;

               
                while (true) {
                    System.out.print("Enter a row (0, 1, or 2): ");
                    row = input.nextInt();
                    System.out.print("Enter a column (0, 1, or 2): ");
                    col = input.nextInt();
                    if (row >= 0 && row <= 2 && col >= 0 && col <= 2 && board[row][col] == ' ') {
                        break;
                    } else {
                        System.out.println("Invalid move! Try again.");
                    }
                }
                board[row][col] = 'X';
            } else {
                System.out.println("Computer's turn");
                int row, col;
                while (true) {
                    row = random.nextInt(3);
                    col = random.nextInt(3);
                    if (board[row][col] == ' ') {
                        break;
                    }
                }
                board[row][col] = 'O';
            }

            // Check for winner
            if (checkWinner(board, 'X')) {
                printBoard(board);
                System.out.println("Player wins!");
                gameEnded = true;
            } else if (checkWinner(board, 'O')) {
                printBoard(board);
                System.out.println("Computer wins!");
                gameEnded = true;
            } else if (isBoardFull(board)) {
                printBoard(board);
                System.out.println("It's a tie!");
                gameEnded = true;
            }

            playerTurn = !playerTurn; // switch turns
        }

        input.close();
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) {
                System.out.println("---------");
            }
        }
        System.out.println();
    }

    public static boolean checkWinner(char[][] board, char symbol) {
        // check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }
        // check diagonals
        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
            (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            return true;
        }
        return false;
    }

    public static boolean isBoardFull(char[][] board) {
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
