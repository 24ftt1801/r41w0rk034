import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShiftingElementByInput {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers are there? ");
        int num = input.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the " + num + " numbers: ");
        for (int i = 0; i < num; i++) {
            list.add(input.nextInt());
        }

        System.out.println("Enter number of left shift: ");
        int shift = input.nextInt();
        shift = shift % num;

        // Negative shift = left rotation
        Collections.rotate(list, -shift);

        System.out.println();

        System.out.println("The shifted arrangement is:");
        for (int num2 : list) {
            System.out.print(num2 + " ");
        }

        input.close();
    }
}
