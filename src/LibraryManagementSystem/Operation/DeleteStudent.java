package LibraryManagementSystem.Operation;

import LibraryManagementSystem.Database.Database;
import LibraryManagementSystem.Person.Librarian;
import LibraryManagementSystem.Person.Reader;

import java.util.Scanner;


public class DeleteStudent implements Operation{
    @Override
    public void operation(Database database,Librarian librarian) {

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter the student ID to be deleted (or 'q' to exit): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Exiting delete operation.");
                break;
            }
            try{
                int id = Integer.parseInt(input);
                if(id <= 0){
                    System.out.println("Invalid student ID. Please enter a valid positive integer.");
                }else {
                    System.out.println("Student ID: " + id);
                    Reader readerToDelete = database.getSortedReaders().get(id);
                    database.getSortedReaders().remove(id);
                    System.out.println("Student with ID "+ readerToDelete + "has been deleted.");
                }
            }catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid positive integer.");
            }
        }
    }
}
