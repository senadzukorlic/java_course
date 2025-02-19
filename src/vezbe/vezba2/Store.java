package vezbe.vezba2;

import java.util.ArrayList;

public class Store {

    private ArrayList<Book> books = new ArrayList<>();

    public Store(ArrayList<Book> books){
        this.books = new ArrayList<>(books);
    }

    public Book getBook(int index){
        Book copyOfBook = new Book(books.get(index));

        return copyOfBook;
    }

    public ArrayList<Book> setBook(int index,Book book){
        books.set(index,book);
        return books;
    }

    public ArrayList<Book> addBook(int index){
    Book copyOfBook = new Book(books.get(index));
    books.add(copyOfBook);
    return books;
    }

    public boolean contains(Book book) {
        return this.books.contains(book);
    }
}
