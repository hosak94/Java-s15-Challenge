package LibraryManagementSystem.Person;

import java.util.ArrayList;
import java.util.List;

public class Author extends Person {
    private List<String> writtenBooks;


    public Author(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
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
}
