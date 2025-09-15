import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SimpleLoginValidation {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String setName = "Ahmad Ali";
        String setPassW = "12345";

        System.out.println("Please enter your username: ");
        String userName = input.nextLine();

        System.out.println("Please enter your password: ");
        String passW = input.nextLine();

        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        if (userName.equals(setName)) {
            if (setPassW.equals(passW)) {
                System.out.println("Welcome "+userName+ "."+ "The time now is "+date);
            }else{
                System.out.println("Error: Password does not match");
            }
            
        }else {
            System.out.println("Error: Invalid Username");
        }

    }
}
