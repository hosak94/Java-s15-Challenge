package LibraryManagementSystem.Database;

import LibraryManagementSystem.Library.Book;
import LibraryManagementSystem.Library.IssueRecord;
import LibraryManagementSystem.Person.Librarian;
import LibraryManagementSystem.Person.Person;
import LibraryManagementSystem.Person.Reader;


import java.util.ArrayList;

import java.util.TreeMap;

public class Database{
    private ArrayList<Librarian> librarians = new ArrayList<Librarian>();
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<String> booknames = new ArrayList<String >();
    private ArrayList<IssueRecord> issueRecordList = new ArrayList<>();

    private TreeMap<Integer, Reader> sortedReaders = new TreeMap<>();


    public ArrayList<IssueRecord> getIssueRecordList() {
        return issueRecordList;
    }

    public void addIssueRecord(IssueRecord issueRecord) {
        issueRecordList.add(issueRecord);
    }

    public void addReader(Reader reader) {
        sortedReaders.put(reader.getId(), reader);
    }

    public TreeMap<Integer, Reader> getSortedReaders() {
        return sortedReaders;
    }

    public boolean containsReader(int id) {
        return sortedReaders.containsKey(id);
    }


    public void addLibrarian(Librarian librarian) {
        librarians.add(librarian);
    }

    public ArrayList<Librarian> getLibrarians() {
        return librarians;
    }
    public int login(String email, String password) {
        int flag = -1;
        for (Librarian person : librarians) {
            if(person.getEmail().matches(email) && person.getPassword().matches(password)){
                flag = librarians.indexOf(person);
                break;
            }
        }
        return flag;
    }
    public Person getLibrarian(int flag) {
        return librarians.get(flag);
    }
    public void AddBook(Book book) {
        books.add(book);
        booknames.add(book.getName());
    }
    public Book getBookByName(String bookName) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(bookName)) {
                return book;
            }
        }
        return null;
    }



    public ArrayList<Book> getBooks() {
        return books;
    }
    public boolean containsBook(String bookName) {
        return booknames.contains(bookName);
    }
    public void deleteBook(Book book) {
        books.remove(book);
        booknames.remove(book.getName());
    }

}
