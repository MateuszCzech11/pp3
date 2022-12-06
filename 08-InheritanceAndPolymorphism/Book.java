public class Book{
    protected String title;
    private String author;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }


    public void display() {
        System.out.println("Tytul= " + title + ", Autor= " + author);
    }


    public String toString() {
        return title + ", autor: " + author;
    }


    
    
}