import java.util.Objects;

public class Book {
    final private String name;
    final private Author author;
    private int yearPublishing;

    public Book (String name, Author author, int yearPublishing){
        this.name = name;
        this.author = author;
        this.yearPublishing = yearPublishing;
    }
    public Book (String name, String firstName, String lastName){
        this.name = name;
        this.author = new Author(firstName,lastName);
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }
    public void setYearPublishing (int yearPublishing){
        this.yearPublishing = yearPublishing;
    }
    @Override
    public String toString() {
        return this.author + " " + this.name + " " + this.yearPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return yearPublishing == book.yearPublishing && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearPublishing);
    }
}
