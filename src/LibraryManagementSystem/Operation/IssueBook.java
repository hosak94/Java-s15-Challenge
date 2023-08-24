package LibraryManagementSystem.Operation;

import LibraryManagementSystem.Database.Database;
import LibraryManagementSystem.Library.Book;
import LibraryManagementSystem.Library.IssueRecord;
import LibraryManagementSystem.Person.Librarian;
import LibraryManagementSystem.Person.Reader;

import java.time.LocalDate;
import java.util.Scanner;

public class IssueBook implements Operation{
    @Override
    public void operation(Database database,Librarian librarian) {

        LocalDate issueDate = LocalDate.now();
        Scanner s = new Scanner(System.in);
        System.out.println("Issue Book");
        System.out.println("Enter the book name");
        String issueBook = s.next();
        Book book = database.getBookByName(issueBook);
        if (book == null ){
            System.out.println("Invalid book name");
            return;
        }
        if(book.getBrwcopies() <= 0) {
            System.out.println("All copies of this book are already issued.");
            return;
        }

        System.out.println("Enter the student id");
        int issueReader = s.nextInt();
        if(!database.containsReader(issueReader)){
            System.out.println("Invalid student id");
            return;
        }

        for(IssueRecord issueRecord : database.getIssueRecordList()) {
            if(issueRecord.getReader().getId() == issueReader && issueRecord.getBook().equals(book)){
                System.out.println("This student has already issued this book.");
                return;
            }
        }
        System.out.println("Issue date: " + issueDate+". You have 14 days to return the book.");
        Reader reader = database.getSortedReaders().get(issueReader);
        IssueRecord issueRecord = new IssueRecord(book, reader, issueDate);
        database.addIssueRecord(issueRecord);

        book.setBrwcopies(book.getBrwcopies() - 1);

    }
}
