import java.util.Scanner;

public class RockPaperScissorLoop {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int userChoice, computerChoice;
        int round = 0;
        int userWin = 0;
        int computerWin = 0;
        String play;
       

        do {
             System.out.println("\nEnter rock (0), paper (1), scissor (2)");
            userChoice = input.nextInt();
            computerChoice = (int)(Math.random()*100) % 3;

            input.nextLine();

            String userTurn = "";
            String computerTurn = "";
            String result = "";

            if (userChoice == 0) userTurn = "rock";
            if (userChoice == 1) userTurn = "paper";
            if (userChoice == 2) userTurn = "scissor";

            if (computerChoice == 0) computerTurn= "rock";
            if (computerChoice == 1) computerTurn = "paper";
            if (computerChoice == 2) computerTurn = "scissor";

            if (userChoice == computerChoice) {
            result = "It is a draw. ";
            }

            if (userChoice == 0 && computerChoice == 2 || userChoice == 1 && computerChoice == 0 || userChoice == 2 && computerChoice == 1){
            result = "You Win";
            userWin++;
            }   

            if (userChoice == 0 && computerChoice == 1 || userChoice == 1 && computerChoice == 2 || userChoice == 2 && computerChoice == 0) {
            result = "You Lose";
            computerWin++;
            }

            round++;

            System.out.println("The computer is "+computerTurn+ ". You are "+ userTurn+ ". " +result);
            System.out.print("\nEnter y to play again: ");
            play = input.nextLine();
        } while (play.equalsIgnoreCase("y"));
        System.out.println("\nIn the total of "+round+ " round(s), You scored "+ userWin + ", Computer scored "+computerWin);

        if (userWin == computerWin) {
            System.out.println("It is a draw game.");
        } else if (userWin > computerWin) {
            System.out.println("You won the game.");
        }else {
            System.out.println("You lose the game.");
        }

    input.close();
        
    }
}
