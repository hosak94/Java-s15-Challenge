package LibraryManagementSystem.Person;

import LibraryManagementSystem.Database.Database;
import LibraryManagementSystem.Operation.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Librarian extends Person implements WhoYouAre, Menu {
    private String email;
    private String password;
    private Operation[] operations;


    public Librarian( String firstName, String lastName,String email,String password) {
        super( firstName, lastName);
        this.email = email;
        this.password = password;
        this.operations = new Operation[] {
           new ViewBooks(),
                new AddNewBook(),
                new DeleteBook(),
                new ViewStudents(),
                new AddNewStudent(),
                new DeleteStudent(),
                new IssueBook(),
                new ReturnBook(),
                new Statistics(),
                new Exit()
        };
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void whoYouAre() {
        System.out.println("I am a Librarian");
    }
    @Override
    public void menu(Database database, Librarian librarian) {
        System.out.println("Library Menu");
        System.out.println("1. View Books");
        System.out.println("2. Add New Book");
        System.out.println("3. Delete Book");
        System.out.println("4. View Students");
        System.out.println("5. Add New Student");
        System.out.println("6. Delete Student");
        System.out.println("7. Issue Book");
        System.out.println("8. Return Book");
        System.out.println("9. Statistics");
        System.out.println("10. Exit");

        Scanner s = new Scanner(System.in);
        try{
            int n = s.nextInt();
            s.nextLine();
            if(n < 1 || n > operations.length){
                System.out.println("Invalid menu option. Please enter a valid number.");
                return;
            }
            this.operations[n-1].operation(database, librarian);
        }catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            s.nextLine();
        }
    }

}
