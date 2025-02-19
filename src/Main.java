import vezbe.vezba2.Book;

public class Main {
    public static void main(String[] args) {

    Book Book1 = new Book("Kitabu-Tevhid","Muhammed ibn Abdulvehhab",5.0, 1000);
    Book copyBook1 =new Book(Book1);
    System.out.println(copyBook1.Print());

    }
}