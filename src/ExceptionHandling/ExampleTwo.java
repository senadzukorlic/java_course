package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleTwo {
    public static void main(String[] args) {
    try {
    readFile("C:\\Users\\PC\\IdeaProjects\\HelloWorld\\src\\ExceptionHandling\\greetings.txt");
    } catch (FileNotFoundException exception){
    System.out.println(exception.getMessage());
    } finally {
    System.out.println("This is finally block");
}
    }

    public static void readFile(String fileName) throws FileNotFoundException {
         FileInputStream fis = new FileInputStream(fileName);
         Scanner scanner = new Scanner(fis);
         System.out.println(scanner.nextLine());
         scanner.close();
    }
}