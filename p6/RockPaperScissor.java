import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter rock (0), paper (1), scissor (2)");

        int userChoice = input.nextInt();
        int computerChoice = (int)(Math.random()*100) % 3;

        input.nextLine();

        String userTurn = "";
        String computerTurn = "";
        String result = "";
        

        if (userChoice == 0) userTurn = "rock";
        if (userChoice == 1) userTurn = "paper";
        if (userChoice == 2) userTurn = "scissor";

        if (computerChoice == 0) computerTurn = "rock";
        if (computerChoice == 1) computerTurn = "paper";
        if (computerChoice == 2) computerTurn = "scissor";

        if (userChoice == computerChoice) {
            result = "It is a draw. ";
        }

        if (userChoice == 0 && computerChoice == 2 || userChoice == 1 && computerChoice == 0 || userChoice == 2 && computerChoice == 1){
            result = "You Win";
        }

        if (userChoice == 0 && computerChoice == 1 || userChoice == 1 && computerChoice == 2 || userChoice == 2 && computerChoice == 0) {
            result = "You Lose";
        }

        System.out.println("The computer is "+computerTurn+ ". You are "+ userTurn+ ". " +result);

        input.close();

    }
}
