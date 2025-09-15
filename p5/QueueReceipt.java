import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class QueueReceipt {
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        FileWriter writer = new FileWriter("C:\\Users\\ADMIN\\Desktop\\practical_5/QReceipt.txt",true);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        String upperName = name.toUpperCase();

        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss"));

        writer.write(date +"\n\nHi, "+name);

        int num = (int)(Math.random()*100);

        writer.write("\nYour Queue No is: "+num);
        writer.close();

        System.out.println("Receipt generated. Thank You");





    }
}

