import java.util.Scanner;

public class PriceComparison {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of the 1st package: $");
        double price1 = input.nextDouble();

        System.out.print("Enter the weight of the 1st package in gram: ");
        double weight1 = input.nextDouble();

        System.out.print("\nEnter the price of the 2nd package: $");
        double price2 = input.nextDouble();

        System.out.print("Enter the weight of the 2nd package in gram: ");
        double weight2 = input.nextDouble();

        double package1 = weight1/price1; //calculating the amount of package1
        double package2 = weight2/price2; //calculating the amount of package2

        String worthPackage = (package1 > package2)? "It is worth more to buy the 1st package" :  //package1 is bigger than package2
                              (package2 < package1)? "It is worth more to buy the 2nd package" :  //package2 is smaller than package1
                              "Both of them are worth to buy";

        System.out.println("\n" + worthPackage);

    }
}
