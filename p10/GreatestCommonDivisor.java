import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        int greatestCommonDiv = 1; 
        int min = Math.min(num1, num2);

        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                greatestCommonDiv = i;
            }
        }

        // Display result
        System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + greatestCommonDiv);
    }
}
