import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num1 = (int)(Math.random()* 101);
        int num2 = (int)(Math.random()* 101);

        System.out.println("What is " + num1 + " + " + num2 + "?");

        int userEnterSum = input.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + userEnterSum + " is " + (userEnterSum == num1 + num2));

        System.out.println("What is " + num1 + " % " + num2 + "?");

        int userEnterModu = input.nextInt();

        System.out.println(num1 + " % " + num2 + " = " + userEnterModu + " is " + (userEnterModu == num1 % num2));


    }
}