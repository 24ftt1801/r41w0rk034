public class LoopsLoopsLoops {
    public static void main(String[] args) {
        
        int counter1 = 1; //its count starts from 1
        int counter2 = 50; //its count starts from 50
        char letter;

        System.out.println("Below is generated using while loop: ");

        while (counter1 <= 20) {
            System.out.print(counter1 + " " );
            counter1++; //post increment by 1
        } 
        System.out.println(); //giving space for nextline

        System.out.println("\nBelow is generated using dowhile loop: ");
        do {
            System.out.print(counter2 + " ");
            counter2--; //post decrement by 1
        } while (counter2 >= 35);
        System.out.println(); //giving space for nextline

        System.out.println("\nBelow is generated using for loop: ");
        for (letter = 'a'; letter <= 'z'; letter++){
            System.out.print(letter + " ");
        }
    }
}
