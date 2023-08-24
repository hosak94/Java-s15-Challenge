package LibraryManagementSystem.Library;

import LibraryManagementSystem.Person.Reader;

import java.time.LocalDate;

public class IssueRecord {
    private Book book;
    private Reader reader;
    private LocalDate issueDate;
    private boolean returnBook;
    private LocalDate returnDate;

    public IssueRecord( Book book, Reader reader, LocalDate issueDate) {

        this.book = book;
        this.reader = reader;
        this.issueDate = issueDate;
        this.returnBook = false;
        this.returnDate = null;

    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isReturnBook() {
        return returnBook;
    }

    public void setReturnBook(boolean returnBook) {
        this.returnBook = returnBook;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public String toString() {
        return "IssueRecord{" +
                "book=" + book.getName() +
                ", reader=" + reader.getFirstName() + " " + reader.getLastName() +
                ", issueDate=" + issueDate +
                ", returnBook=" + returnBook +
                ", returnDate=" + returnDate +
                '}';
    }
}
