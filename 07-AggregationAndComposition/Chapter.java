public class Chapter {
    String chTitle;
    int pageNo;
    int startingPage;

    

    public Chapter(String chTitle, int pageNo, int startingPage) {
        this.chTitle = chTitle;
        this.pageNo = pageNo;
        this.startingPage = startingPage;
    }



    public String toString() {
        return "Rozdzial [Tytul Rozdzialu=" + chTitle + ", Ilosc stron=" + pageNo + ", Strona poczatkowa rozdzialu=" + startingPage + "]";
    }
    
}
