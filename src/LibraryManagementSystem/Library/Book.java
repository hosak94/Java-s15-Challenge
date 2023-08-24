package LibraryManagementSystem.Library;

import LibraryManagementSystem.Person.Author;

import java.util.ArrayList;
import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private String publisher;
    private String address;
    private String status;
    private int qty;
    private int price;
    private int brwcopies;
    public Book(){};

    public Book(String name, Author author, String publisher, String address, String status, int qty, int price, int brwcopies) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.address = address;
        this.status = status;
        this.qty = qty;
        this.price = price;
        this.brwcopies = brwcopies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBrwcopies() {
        return brwcopies;
    }

    public void setBrwcopies(int brwcopies) {
        this.brwcopies = brwcopies;
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", publisher='" + publisher + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                ", brwcopies=" + brwcopies +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }
}
