import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("What is your target amount? ");
        double target_amount = input.nextDouble();

        System.out.print("How many month(s) to reach your goal? ");
        int monthReachGoal = input.nextInt();

        int days = monthReachGoal * 30; //assume 1 month = 30 days
        double amountSave = target_amount / days;

        System.out.printf("The amount you need to save  per day is %.2f", amountSave);

    }
}
