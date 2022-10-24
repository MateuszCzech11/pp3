public class Book{
    String tytul;
    String rok_wydania;
    String autor;
    boolean czy_otwarta;
    
    public void Otworz(){
        czy_otwarta = true;
        System.out.println("Ksiazka zostala otwarta.");
    }
    
    public void Zamknij(){
        czy_otwarta = false;
        System.out.println("Ksiazka zostala zamknieta.");
    }
    
    public void WyswietlInformacje(){
        System.out.println("Tytul: "+ tytul);
        System.out.println("Rok wydania: "+ rok_wydania);
        System.out.println("Autor książki: "+ autor);
        System.out.println("Czy książka otwarta: "+ czy_otwarta);
    }
    
    public static void main(String[] args){
        Book b1 = new Book();
        b1.tytul = "Chrzest ognia";
        b1.rok_wydania = "1996";
        b1.autor = "A.Sapkowski";
        b1.Zamknij();
        b1.WyswietlInformacje();
        
        Book b2= new Book();
        b2.tytul = "Powrót króla";
        b2.rok_wydania = "1955";
        b2.autor = "J.R.R. Tolkien";
        b2.Otworz();
        b2.WyswietlInformacje();
        
    }
}