import java.util.Scanner;

public class Reverse5Letters {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 5 letters word: ");
        String word = input.nextLine();

        String reversedWord = "";
        for (int i = word.length()-1; i >=0; i--){
            reversedWord += word.charAt(i);
        }
        System.out.print("The reverse of the word "+word+" is "+reversedWord);
    }
}
