package LibraryManagementSystem.Person;

public class Librarian extends Person implements WhoYouAre,Menu {
    private String email;
    private String password;

    public Librarian(int id, String firstName, String lastName,String email,String password) {
        super(id, firstName, lastName);
        this.email = email;
        this.password = password;
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
    public void menu() {
        System.out.println("Library Menu");
    }
}
