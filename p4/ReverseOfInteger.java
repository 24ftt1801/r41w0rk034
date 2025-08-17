import java.util.Scanner;

public class ReverseOfInteger {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num, pos1, pos2, pos3;

        System.out.print("Enter and integer between 100 and 999: ");

        num = input.nextInt();

        pos1 = num/100;
        pos2 = (num/10) % 10;
        pos3 = num % 10; 


        System.out.println("The reverse of " + num + " is " + pos3 + pos2 + pos1);

    }
}
