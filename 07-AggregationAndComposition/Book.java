import java.util.ArrayList;

public class Book {
    String title;
    int pages;
    Writer author;
    ArrayList<Chapter> chapters = new ArrayList<Chapter>();

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
        this.author = new Writer("A.Sapkowski",67);
        chapters.add(new Chapter("1: Poczatek",3,1));
        chapters.add(new Chapter("2: Srodek",10,4));
        chapters.add(new Chapter("3: Koniec",4,14));
    }

    public String toString(){
        return title + "- by " + author;
    }
}
