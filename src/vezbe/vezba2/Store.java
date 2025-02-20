package vezbe.vezba2;

import java.util.ArrayList;
import java.util.Objects;

public class Store {

    private ArrayList<Book> books = new ArrayList<>();

    public Store(ArrayList<Book> books){
        this.books = new ArrayList<>(books);
    }
    public Store() {
        this.books = new ArrayList<>();
    }
    public Book getBook(int index){
        Book copyOfBook = new Book(books.get(index));
        return copyOfBook;
    }

    public ArrayList<Book> setBook(int index,Book book){
        books.set(index,book);
        return books;
    }

    public ArrayList<Book> addBook(Book book){
    Book copyOfBook = new Book(book);
    books.add(copyOfBook);
    return books;
    }

    public boolean contains(Book book) {
        return this.books.contains(book);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(books, store.books);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(books);
    }

    public Book sellBook (String title){
        for (Book book : books){
                if (book.getTitle().equals(title)){
                books.remove(book);
                return book;
            }
        }
        return null;
    }
}
