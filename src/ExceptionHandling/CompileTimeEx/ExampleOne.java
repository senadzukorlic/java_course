package ExceptionHandling.CompileTimeEx;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\PC\\IdeaProjects\\HelloWorld\\src\\ExceptionHandling\\greetings.txt");
             Scanner scanner = new Scanner(fis);
             System.out.println(scanner.nextLine());
             scanner.close();
        }catch (FileNotFoundException exception){
            System.out.println(exception.getMessage());
        }

    }

}