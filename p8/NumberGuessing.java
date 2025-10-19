import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Integer> numberList = Arrays.asList(numbers);
        Collections.shuffle(numberList);
        numberList.toArray(numbers);

        int chances = 10;
        boolean win = false;

        while (chances > 0) {
            System.out.println("Guess 4 numbers (no duplicates):");

            int[] guess = new int[4];
            for (int i = 0; i < 4; i++) {
                guess[i] = input.nextInt();
            }

            int score = 0;
            for (int i = 0; i < 4; i++) {
                if (guess[i] == numbers[i]) {
                    score++;
                }
            }

            chances--;

            if (score == 4) {
                System.out.print("You have score " + score + " out of the 4 numbers. ");
                System.out.println("You Win!");
                win = true;
                break;
            } else if (chances > 0) {
                System.out.println("You have score " + score + " out of the 4 numbers. You have " + chances + " chances left.");
            } else {
                System.out.print("The actual number is ");
                for (int i = 0; i < 4; i++) {
                    System.out.print(numbers[i] + " ");
                }
                System.out.println("You Lose.");
            }
        }

        input.close();
    }
}
