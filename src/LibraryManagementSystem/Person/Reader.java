package LibraryManagementSystem.Person;

import LibraryManagementSystem.Database.Database;

import java.util.ArrayList;

import java.util.Objects;

public class Reader extends Person implements WhoYouAre,Menu{
    private int id;
    private ArrayList<String> borrowedBooks;

    private int maxBooksAllowed = 5;


    public Reader(int id,String firstName, String lastName, ArrayList<String> borrowedBooks) {
        super(firstName, lastName);
        this.id = id;
        this.borrowedBooks = new ArrayList<>();
    }

    public Reader(int id ,String firstName, String lastName) {
        super(firstName, lastName);
        this.id = id;
    }

    public int getMaxBooksAllowed() {
        return maxBooksAllowed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void addBorrowedBook(String bookName) {
        borrowedBooks.add(bookName);
    }
    @Override
    public void whoYouAre() {
        System.out.println(getFirstName()+" "+ getLastName());
    }

    @Override
    public void menu(Database database, Librarian librarian) {}

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                "name: " + getFirstName() +" "+ getLastName() +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
