import java.util.ArrayList;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

public class Library {
    ArrayList<Book> contents = new ArrayList<Book>();


    public ArrayList<Book> displayContents(){
        return contents;
    }
    

    public void addBook(String title, String author){
        contents.add(new Book(title,author));
    }

    public void addBook(String title, String author, int minutes, int seconds,String filename){
        contents.add(new Audiobook(title,author,minutes,seconds,filename));
    }
}
