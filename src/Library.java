import java.util.Arrays;

public class Library {
    private Book [] books;

    public Library (int size){
        this.books = new Book[size];
    }
    public boolean addNewBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return true;
            }
        }
        if (books[books.length - 1] != null) {
            System.out.println("Не вошли в библиотеку: ");
            System.out.println(book.toString() + "\n");
            return false;
        }
        return false;
    }

    public void printAllBooks () {
        System.out.println("Книги в библиотеке: ");
        for (Book book : books) {
            if (book != null) {
                System.out.println(book.toString());
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Library library = (Library) o;
        return Arrays.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(books);
    }
}
