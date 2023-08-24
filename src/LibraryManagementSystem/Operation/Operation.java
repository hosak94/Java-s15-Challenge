package LibraryManagementSystem.Operation;

import LibraryManagementSystem.Database.Database;
import LibraryManagementSystem.Person.Librarian;



public interface Operation {
    public void operation(Database database, Librarian librarian);
}
