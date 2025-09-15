import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalNum = 0;
        int positiveNum = 0;
        int negativeNum = 0;
        int countNum = 0;
        int num;
        double average = 0;

        System.out.println("Enter an integer, the input ends if it is 0: ");
        
        while (true) {
            num = input.nextInt();

            if (num == 0) { //if user enter 0, it will stop the loop
                break;
            } 

            //the step to check whether the number is negative or postive
            if (num > 0) {
                positiveNum++;
            } else{
                negativeNum++;
            }

            totalNum += num;
            countNum++;
        }
        if (countNum == 0) {
            System.out.println("\nNo number is entered except for 0 to end the program");
        } else{
            average = (double) totalNum / countNum;
            System.out.println("\nThe number of positive is "+positiveNum);
            System.out.println("The number of negatives is "+negativeNum);
            System.out.println("The total is "+totalNum);
            System.out.printf("The average is %.2f\n", average);
        }
        

        input.close();
        

        

    }
}
