package presentation;

import data.InMemoryBookRepository;
import domain.Book;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        InMemoryBookRepository bookStore = new InMemoryBookRepository();

        // Добавляем книги в магазин
        Book book1 = new Book("1", "Clean Code", "Robert C. Martin", 34.99);
        Book book2 = new Book("2", "Effective Java", "Joshua Bloch", 29.99);
        Book book3 = new Book("3", "«JAVA EE паттерны проектирования для профессионалов»", "Мурат Йенер, Алекс Фидом", 119.99);
        Book book4 = new Book("4", "Java. Библиотека профессионала", "Кей Хорстманн, Гари Корнелл", 19.99);
        Book book5 = new Book("5", "Java. Полное руководство", "Крейг Уоллс", 49.99);
        Book book6 = new Book("6", "Spring в действии", "Герберт Шилдт", 29.99);
        bookStore.addBook(book1);
        bookStore.addBook(book2);
        bookStore.addBook(book3);
        bookStore.addBook(book4);
        bookStore.addBook(book5);
        bookStore.addBook(book6);
        System.out.println("\nСписок книг в репозитории:\n");

        ArrayList<Book> allBooks = bookStore.getAllBooks();
        for (Book book : allBooks) {
            System.out.println(
                    "Артикул: " + book.getId() + ", Книга: " + book.getTitle() + ", Автор: " + book.getAuthor() + ", Цена: $" + book.getPrice());
        }
        bookStore.removeBook(book2);
        System.out.println("\nСписок книг в репозитории после продажи:\n");

        ArrayList<Book> allBooks2 = bookStore.getAllBooks();
        for (Book book : allBooks2) {
            System.out.println(
                    "Артикул: " + book.getId() + ", Книга: " + book.getTitle() + ", Автор: " + book.getAuthor() + ", Цена: $" + book.getPrice());
        }
    }
}