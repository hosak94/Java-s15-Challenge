package LibraryManagementSystem.Operation;

import LibraryManagementSystem.Database.Database;
import LibraryManagementSystem.Library.Book;
import LibraryManagementSystem.Person.Librarian;

public class ViewBooks implements Operation{
    @Override
    public void operation(Database database,Librarian librarian) {
        System.out.println("List of books");
        for(Book book: database.getBooks()) {
            System.out.println(book);
        }
    }
}
