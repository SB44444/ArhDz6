package data;

import domain.Book;
import java.util.ArrayList;

/**
 * Класс InMemoryBookRepository представляет реализацию интерфейса BookRepository,
 * использует коллекцию ArrayList для хранения книг.
 */
public class InMemoryBookRepository implements BookRepository {
    protected ArrayList<Book> books;
    /**
     * Конструктор Создает новый экземпляр класса InMemoryBookRepository.
     */
    public InMemoryBookRepository() {
        this.books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        return new ArrayList<>(books);
    }
}
