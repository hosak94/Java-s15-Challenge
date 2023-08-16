package LibraryManagementSystem.Database;

import LibraryManagementSystem.Person.Librarian;
import LibraryManagementSystem.Person.Person;

import java.util.ArrayList;

public class Database {
    private ArrayList<Librarian> librarians = new ArrayList<Librarian>();

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
}
