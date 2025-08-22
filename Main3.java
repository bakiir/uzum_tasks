import model.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Book> booksDB = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int bookIdCounter = 0;

        while (true) {
            System.out.println("Choose an action");
            System.out.println("1. Add new Book");
            System.out.println("2. Get all Books");
            System.out.println("3. Get By ID");
            System.out.println("4. Delete book by id");
            System.out.println("5. Exit");

            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1:
                    Book book = new Book();
                    book.setId(bookIdCounter++);
                    System.out.println("Name: ");
                    book.setTitle(scanner.nextLine());

                    System.out.println("Genre: ");
                    book.setGenre(scanner.nextLine());

                    booksDB.add(book);
                    System.out.println("Book added!");
                    break;

                case 2:
                    if (booksDB.isEmpty()) {
                        System.out.println("No books found.");
                    } else {
                        for (Book b : booksDB) {
                            System.out.printf("Book: %d, %s, %s%n", b.getId(), b.getTitle(), b.getGenre());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter the Id of book: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    Book found = null;
                    for (Book b : booksDB) {
                        if (b.getId() == id) {
                            found = b;
                            break;
                        }
                    }
                    if (found != null) {
                        System.out.printf("Book: %d, %s, %s%n", found.getId(), found.getTitle(), found.getGenre());
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.println("Enter Id of book to delete: ");
                    int delId = scanner.nextInt();
                    scanner.nextLine();

                    Book toRemove = null;
                    for (Book b : booksDB) {
                        if (b.getId() == delId) {
                            toRemove = b;
                            break;
                        }
                    }
                    if (toRemove != null) {
                        booksDB.remove(toRemove);
                        System.out.println("Book deleted.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.println("Bye Bye");
                    return;
                default:
                    System.out.println("Invalid action");
            }
        }
    }
}
