package LibraryManagementSystem.Operation;

import LibraryManagementSystem.Database.Database;
import LibraryManagementSystem.Person.Librarian;
import LibraryManagementSystem.Person.Reader;

import java.util.Scanner;

public class AddNewStudent implements Operation{
    @Override
    public void operation(Database database,Librarian librarian) {
        Scanner s = new Scanner(System.in);
        int id=0;
            System.out.println("Enter student id");
            int studentId = s.nextInt();
            if(database.containsReader(studentId)){
                System.out.println("Student has already exist!!!");
                return;
            }
            id=studentId;

            System.out.println("Enter student first name:");
            String firstName = s.next();
            System.out.println("Enter student last name");
            String lastName = s.next();

            Reader reader = new Reader(id, lastName,firstName);
            database.addReader(reader);
            System.out.println("Student added successfully");
        }

}
