package LibraryManagementSystem.Person;

import java.util.ArrayList;
import java.util.List;

public class Reader extends Person implements WhoYouAre{
    private List<String> readBooks;
    public Reader(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
        readBooks = new ArrayList<>();
    }
    public void addReadBooks(String bookTitle) {
        readBooks.add(bookTitle);
    }

    public List<String> getReadBooks() {
        return readBooks;
    }

    @Override
    public void whoYouAre() {
        super.whoYouAre();
    }
}
