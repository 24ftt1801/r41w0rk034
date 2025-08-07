import java.util.Scanner;

public class NumberOfDurians {
    public static void main(String[] args) {
        
        System.out.println("Each durian cost $15.75");

        Scanner input = new Scanner(System.in);
        double price_of_durian = 15.75;
        

        System.out.print("How much money do you have? ");
        double money = input.nextDouble();

        int durianBuy = (int) (money/price_of_durian);

        System.out.print("The number of durian(s) you can buy is " + durianBuy);

    }
}
