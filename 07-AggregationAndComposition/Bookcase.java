import java.util.ArrayList;

public class Bookcase {
    ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public ArrayList<Book> displayBooks(){
        return books;
    }

    public static void main(String[] args) {
        Book wiedzmin = new Book("Czas pogardy", 350);
        Book wiedzmin2 = new Book("Wieza jaskolki", 433);
        Bookcase b = new Bookcase();
        b.addBook(wiedzmin);
        System.out.println(b.displayBooks());
        b.addBook(wiedzmin2);
        System.out.println(b.displayBooks());
        b.removeBook(wiedzmin);
        System.out.println(b.displayBooks());

    }
    
}
