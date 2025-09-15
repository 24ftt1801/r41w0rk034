import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        //Declare the first two fibonacci terms
         int term0 = 0;
         int term1 = 1;
         int tempo;

         System.out.print("Please enter the term: ");
         int userEnter = input.nextInt();

         if (userEnter == 0) {
            System.out.println("At term 0 the number is "+term0);
         } else if (userEnter == 1) {
            System.out.println("At term 1 the number is "+term1);
         } else {
            int fibonacciNumber = 0;
            for (int i = 2; i <= userEnter; i++){
                fibonacciNumber = term0 + term1;
                term0 = term1;
                term1 = fibonacciNumber;
            }
            System.out.println("At term "+ userEnter + " the number is "+ fibonacciNumber);
         }

         input.close();

    }
}
