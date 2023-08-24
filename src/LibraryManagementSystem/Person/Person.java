package LibraryManagementSystem.Person;

import java.util.Objects;

public abstract class Person implements WhoYouAre,Menu{
    private String firstName;
    private String lastName;

    public Person( String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public void whoYouAre() {
        System.out.println("I am a Person");
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
