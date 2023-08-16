package LibraryManagementSystem;


import LibraryManagementSystem.Database.Database;
import LibraryManagementSystem.Person.Librarian;
import LibraryManagementSystem.Person.Person;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner s;
    static Database database;

    public static void main(String[] args) {
        database = new Database();
        System.out.println("Welcome to Library Management System!");
        int num;
        do{
            System.out.println("0. Exit\n1.Login\n2. New Librarian"
            );
            s = new Scanner(System.in);
            num = s.nextInt();

            switch (num) {
                case 1: login();
                case 2: newLibrarian();

            }
        }while (num != 0);
    }
    private static void login() {
        System.out.println("Enter email: ");
        String email = s.next();
        System.out.println("Enter password: ");
        String password = s.next();
        int flag = database.login(email,password);
        if(flag != -1) {
            Person librarian = database.getLibrarian(flag);
            System.out.println("Welcome " +librarian.getFirstName()+ " "+ librarian.getLastName());
            librarian.menu();

        }else {
            System.out.println("User doesn't exist!");
        }
    }
    private static void newLibrarian() {
        System.out.println("Enter id: ");
        int id = s.nextInt();
        System.out.println("Enter first name: ");
        String firstname = s.next();
        System.out.println("Enter last name: ");
        String lastname = s.next();
        System.out.println("Enter email: ");
        String email = s.next();
        System.out.println("Enter password: ");
        String password = s.next();
        Person librarian = new Librarian(id,firstname,lastname,email,password);
        database.addLibrarian((Librarian) librarian);
        System.out.println("User created successfully!");
    }
    private static void listLibrarians() {
        ArrayList<Librarian> librarians = database.getLibrarians();
        for (Librarian librarian : librarians) {
            System.out.println("ID: " + librarian.getId());
            System.out.println("Name: " + librarian.getFirstName() + " " + librarian.getLastName());
            System.out.println("Email: " + librarian.getEmail());
            System.out.println("----------------------");
        }
    }


}