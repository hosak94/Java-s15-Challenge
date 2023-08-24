package LibraryManagementSystem.Operation;

import LibraryManagementSystem.Database.Database;
import LibraryManagementSystem.Person.Librarian;

public class Statistics implements Operation{
    @Override
    public void operation(Database database, Librarian librarian) {
        System.out.println(database.getIssueRecordList());
    }
}
