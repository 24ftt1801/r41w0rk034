import java.util.Scanner;

public class AddFourNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, num4, sumAns, userAns;

        num1 = (int)(Math.random()*100);
        num2 = (int)(Math.random()*100);
        num3 = (int)(Math.random()*100);
        num4 = (int)(Math.random()*100);
        sumAns = num1 + num2 + num3 + num4;

        System.out.println("What is " + num1+ " + " + num2 + " + " + num3 + " + " + num4 + "?");
        userAns = input.nextInt();

        if (userAns == sumAns) {
            System.out.println("Well done, you are correct");
        } else {
            System.out.println("Nice try, the sum should be "+sumAns);
        }

    }
}
