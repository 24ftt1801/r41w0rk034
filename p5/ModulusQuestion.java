import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ModulusQuestion {
    public static void main(String[] args) throws IOException{
        
        new File ("C:\\Users\\ADMIN\\Desktop\\practical_5").mkdir();

        FileWriter writer = new FileWriter("C:\\Users\\ADMIN\\Desktop\\practical_5/ModulusQuestion.txt",true);

        int num1 = (int)(Math.random()*100);
        int num2 = (int)(Math.random()*100);

        String output = num1 + " % "+ num2 + "?";

        writer.write(output + "\r\n");
        writer.close();

        System.out.println("A new question added");
        
    }
}
