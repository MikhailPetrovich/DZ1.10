public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Book book1 = new Book("Мастер и маргарита.", new Author("Михаил","Булгаков"), 2014);
        Book book2 = new Book("Поклонник", new Author("Анна", "Джей."), 2019);
        Book book3 = new Book("Змей.", new Author("Екатерина", "Барсова."), 2005);
        book3.setYearPublishing(2009);
        Book book4 = new Book("Точка обмана", new Author("Сергей", "Бах."), 2006);


        Library citiLib = new Library(5);
        citiLib.addNewBook(new Book("Тень", new Author("Михаил", "Петров."), 1950));
        citiLib.addNewBook(new Book("Море", new Author("Иван", "Птаха."), 1999));
        citiLib.addNewBook(new Book("Капитанская дочка", new Author("Александр", "Пушкин."), 1838));
        citiLib.addNewBook(new Book("Ручей", new Author("Михаил", "Лерманов."), 1940));
        citiLib.addNewBook(new Book("Горе ", new Author("Александр", "Воронин."), 1825));
        citiLib.addNewBook(new Book("Души", new Author("Николай", "Петров."), 2042));
        citiLib.addNewBook(new Book("Мастер", new Author("Михаил", "Щеглов."), 1367));

        citiLib.printAllBooks();


        System.out.println();
        System.out.println(book1.equals(book2));
        System.out.println(book1.getAuthor().equals(book4.getAuthor()));
        System.out.println(book1.hashCode());
        System.out.println(book3.getAuthor().hashCode());
        System.out.println(citiLib.equals(book4));
        System.out.println(citiLib.hashCode());


    }

}