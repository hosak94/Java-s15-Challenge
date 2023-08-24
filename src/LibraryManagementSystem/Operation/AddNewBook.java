package LibraryManagementSystem.Operation;

import LibraryManagementSystem.Database.Database;
import LibraryManagementSystem.Library.Book;
import LibraryManagementSystem.Person.Author;
import LibraryManagementSystem.Person.Librarian;
import LibraryManagementSystem.validation.ValidationUtil;

import java.util.Scanner;

public class AddNewBook implements Operation {
    private boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    @Override
    public void operation(Database database,Librarian librarian) {

        Scanner s = new Scanner(System.in);
        Book book = new Book();

            System.out.println("Enter book name:");
            String bookName = s.next();
        if (ValidationUtil.isNumeric(bookName)) {
            System.out.println("Invalid book name.");
            return;
        }
        if(database.containsBook(bookName)){
                System.out.println("A book with the same name already exists.");
                return;
        }
        book.setName(bookName);
        System.out.println("Enter book author's first name");
        String firstname = s.next();
        if (ValidationUtil.isNumeric(firstname)){
            System.out.println("Invalid first name");
            return;
        }
        System.out.println("Enter book author's last name");
        String lastname = s.next();
        if(ValidationUtil.isNumeric(lastname)){
            System.out.println("Invalid last name");
        }
        Author author = new Author(firstname,lastname);
        book.setAuthor(author);
        System.out.println("Enter book publisher");
        book.setPublisher(s.next());
        System.out.println("Enter book collection address");
        book.setAddress(s.next());
        System.out.println("Enter quantity");
        book.setQty(s.nextInt());
        System.out.println("Enter price");
        book.setPrice(s.nextInt());
        System.out.println("Enter borrowing copies");
        book.setBrwcopies(s.nextInt());
        database.AddBook(book);
        System.out.println("Book added successfully");

    }
}
