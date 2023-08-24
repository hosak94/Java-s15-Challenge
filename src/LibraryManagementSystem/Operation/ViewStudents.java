package LibraryManagementSystem.Operation;

import LibraryManagementSystem.Database.Database;
import LibraryManagementSystem.Person.Librarian;
import LibraryManagementSystem.Person.Reader;

public class ViewStudents implements Operation{
    @Override
    public void operation(Database database,Librarian librarian) {
        System.out.println("List of Students");
        System.out.println(database.getSortedReaders());
        for(Reader reader:database.getSortedReaders().values()){
            System.out.println("ID: " + reader.getId());
            System.out.println("Name: " + reader.getFirstName() + " "+ reader.getLastName());
            System.out.println("Books Borrowed: " + reader.getBorrowedBooks());
            System.out.println("----");
        }
    }
}
