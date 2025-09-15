import java.util.Scanner;

public class OccurenceOfMaxNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers, the input ends with 0 entered: ");

        int largest = 0; // initialize variable to 0
        int count = 0; // intialize variable to 0 (to count occurences)
        int num; 

        while (true) { //infinite loop, will keep running until encounter word 'break'
            num = input.nextInt();
            if (num == 0) {
            break;
            }
        
            if (num > largest) {
                largest = num;
                count = 1; //consider as first occurrence of new largest  num
          } else if (num == largest) {
                count ++; //post increment by 1 
          }
        }
    
        System.out.println("\nThe largest number is "+largest);
        System.out.println("The occurrence count of the largest number is "+count);
        input.close();
    }
}
