package LibraryManagementSystem.Operation;

import LibraryManagementSystem.Database.Database;
import LibraryManagementSystem.Library.IssueRecord;
import LibraryManagementSystem.Person.Librarian;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ReturnBook implements Operation{
    @Override
    public void operation(Database database,Librarian librarian) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Return Book");
        System.out.println("Enter the student id: ");
        int studentId = scanner.nextInt();
        if(!database.containsReader(studentId)){
            System.out.println("Invalid student id");
            return;
        }
        System.out.println("Enter the book name: ");
        String bookName = scanner.next();

        IssueRecord issueRecord = null;
        for(IssueRecord record : database.getIssueRecordList()){
            if(record.getReader().getId() == studentId &&
            record.getBook().getName().equalsIgnoreCase(bookName) &&
            !record.isReturnBook()) {
                issueRecord = record;
                break;
            }
        }
        if (issueRecord == null) {
            System.out.println("No matching issue record found or book already returned");
            return;
        }
        System.out.println("Enter the return date (yyyy-MM-dd): ");
        String returnDAteString = scanner.next();
        LocalDate returnDate = LocalDate.parse(returnDAteString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        issueRecord.setReturnDate(returnDate);
        issueRecord.setReturnBook(true);
        LocalDate issueDate = issueRecord.getIssueDate();
        long daysBetween = ChronoUnit.DAYS.between(issueDate,returnDate);
        if(daysBetween > 14) {
            System.out.println("You returned the book late. Penalty: $10");
        }else{
            System.out.println("Book returned successfully.");
        }
    }
}
