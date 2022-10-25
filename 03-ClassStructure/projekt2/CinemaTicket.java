public class CinemaTicket{
    static String cinema_name = "Multikino";
    String film_title;
    String row;
    String seat;
    double price;
    
    public void ticketData(){
        System.out.println("Kino: "+ cinema_name);
        System.out.println("Tytuł: "+ film_title);
        System.out.println("Rząd: "+ row);
        System.out.println("Miejsce: "+ seat);
        System.out.println("Cena biletu: "+ price);
        
    }
    
    public static void main(String[] args){
        CinemaTicket c1 = new CinemaTicket();
        c1.film_title="Film";
        c1.row="3";
        c1.seat="6";
        c1.price= 17.50;
        
        CinemaTicket c2 = new CinemaTicket();
        c2.film_title="GoodFilm";
        c2.row="8";
        c2.seat="10";
        c2.price= 19.99;
    }
}