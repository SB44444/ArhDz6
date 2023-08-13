package data;

import domain.Book;
import java.util.ArrayList;

/**
 * Интерфейс BookRepository определяет методы управления в интернет-магазине.
 */
public interface BookRepository {
    /**
     * Получает все книги из репозитория.
     */
    ArrayList<Book> getAllBooks();

    /**
     * Добавляет новую книгу в репозиторий.
     *
     * @param book книга для добавления.
     */
    void addBook(Book book);

    /**
     * Удаляет книгу из репозитория.
     *
     * @param book книга для удаления из репозитория.
     */
    void removeBook(Book book);
}
