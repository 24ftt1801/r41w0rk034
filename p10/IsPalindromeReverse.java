import java.util.Random;
import java.util.Scanner;

public class IsPalindromeReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(900) + 100;

        System.out.print("Enter the reverse of " + num + ": ");
        int userInput = input.nextInt();

        while (userInput < 100 || userInput > 999) {
            System.out.print("Please enter a 3-digit reverse number of " + num + ": ");
            userInput = input.nextInt();
        }

        boolean result = isPalindrome(num, userInput);

        System.out.println("The digit " + userInput + " is palindrome of " + num + " is " + result + ".");
        
        input.close();
    }

    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int original, int userInput) {
        int reversedOriginal = reverse(original);
        return reversedOriginal == userInput;
    }
}
