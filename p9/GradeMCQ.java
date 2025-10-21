import java.util.Scanner;

public class GradeMCQ {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        char[][] answers = {
            {'A', 'B', 'C', 'D', 'A', 'B'}, 
            {'C', 'D', 'D', 'A', 'B', 'D'}, 
            {'D', 'D', 'A', 'B', 'B', 'B'}, 
            {'C', 'A', 'D', 'A', 'B', 'C'} 
        };

        char[] key = new char[6];

        System.out.println("Enter the key to the MCQ: ");
        for (int i = 0; i < key.length; i++) {
            key[i] = input.next().toUpperCase().charAt(0);
        }

        System.out.println();

        for (int student = 0; student < answers.length; student++) {
            int correctCount = 0;

            for (int question = 0; question < answers[student].length; question++) {
                if (answers[student][question] == key[question]) {
                    correctCount++;
                }
            }

            String result = (correctCount >= 3) ? "passed" : "failed";
            System.out.println("Student " + student + "'s correct count is " + correctCount + 
                               ". Therefore, he/she " + result + " the test.");
        }

        input.close();
    }
}
