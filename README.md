https://github.com/SB44444/ArhDz6.git

**Архитектура ПО (семинары)**

*Урок 6. Принципы построения приложений «чистая архитектура»*
*Задание:*
Задание: Переделка программы под чистую архитектуру
Вам предоставляется программа, которая представляет интернет-магазин книг с использованием коллекций.
Ваша задача - переработать эту программу, применяя принципы чистой архитектуры для лучшей организации кода и разделения компонентов.
В результате переработки программа должна следовать принципам Boundary-Control-Entity (BCE).
*Реализация:*
Для соблюдения принципов чистого кода в реализации применена схема Boundary-Control-Entity. 
Центральный элемент приложения - модель книги (бизнес-логика) вынесена в самостоятельный пакет domain и отдельный класс Book. 
Не имеет зависимости от деталей реализации. Объекты экземпляров класса Book реализуются через интерфейс BookRepository,
методы которого имплементируются объектами класса InMemoryBookRepository. Логика реализации вынесена в отдельный пакет data. 
И В слой пользовательского интерфейса находится в своём пакете presentation, где обрабатываются внешние запросы. Таким образом, 
приложение имеет чёткую структуру компонентов, ответственность между слоями разделена, 
бизнес-логика высокого уровня не имеет зависимости от низкоуровневой реализации.


import java.util.ArrayList;
import java.util.List;

// Класс представляющий книгу
class Book {
private String id;
private String title;
private String author;
private double price;

    // Конструктор, геттеры и сеттеры
}

// Класс, реализующий хранилище книг с использованием коллекций
class BookStore {
private List<Book> books;

    public BookStore() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }
}

public class Main {
public static void main(String[] args) {
BookStore bookStore = new BookStore();

        // Добавляем книги в магазин
        Book book1 = new Book("1", "Clean Code", "Robert C. Martin", 34.99);
        Book book2 = new Book("2", "Effective Java", "Joshua Bloch", 29.99);
        bookStore.addBook(book1);
        bookStore.addBook(book2);

        // Получаем список всех книг в магазине
        List<Book> allBooks = bookStore.getAllBooks();
        for (Book book : allBooks) {
            System.out.println("Книга: " + book.getTitle() + ", Автор: " + book.getAuthor() + ", Цена: $" + book.getPrice());
        }
    }
}