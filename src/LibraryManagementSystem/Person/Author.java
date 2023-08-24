package LibraryManagementSystem.Person;

import LibraryManagementSystem.Database.Database;

import java.util.ArrayList;
import java.util.List;

public class Author extends Person implements Menu {
    private List<String> writtenBooks;


    public Author( String firstName, String lastName) {
        super( firstName, lastName);
        writtenBooks = new ArrayList<>();
    }
    public void addBook(String bookTitle) {
        writtenBooks.add(bookTitle);
    }

    public List<String> getWrittenBooks() {
        return writtenBooks;
    }

    @Override
    public void whoYouAre() {
        System.out.println("I am an Author");
    }


    @Override
    public void menu(Database database,Librarian librarian) {

    }

    @Override
    public String toString() {
        return getFirstName()+" "+ getLastName();
    }
}
