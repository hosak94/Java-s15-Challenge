package LibraryManagementSystem.Operation;

import LibraryManagementSystem.Database.Database;
import LibraryManagementSystem.Library.Book;
import LibraryManagementSystem.Person.Librarian;

import java.util.Scanner;

public class DeleteBook implements Operation {
    @Override
    public void operation(Database database, Librarian librarian) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the name of the book to delete:");
            String bookName = scanner.nextLine();

            for (Book book : database.getBooks()) {
                if (book.getName().equalsIgnoreCase(bookName)) {
                    System.out.println("Enter the author's first name of the book to delete:");
                    String authorFirstName = scanner.nextLine();
                    System.out.println("Enter the author's last name of the book to delete:");
                    String authorLastName = scanner.nextLine();

                    if (book.getAuthor().getFirstName().equalsIgnoreCase(authorFirstName) &&
                            book.getAuthor().getLastName().equalsIgnoreCase(authorLastName)) {
                        database.deleteBook(book);
                        System.out.println("Book deleted successfully.");
                        return;
                    }
                }
            }


        }
    }
}
