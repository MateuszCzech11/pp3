public class CinemaTicket2{
    static String cinema_name = "Multikino";
    String film_title;
    int row;
    String seat;
    double price;
    
    public CinemaTicket2(String film_title, int row, String  seat){
        this.film_title = film_title;
        this.row = row;
        this.seat = seat;
        if (row <=2){
            price = 10;
        } else {
            price = 25;
        }
    }
    
    public void ticketData(){
        System.out.println("Kino: "+ cinema_name);
        System.out.println("Tytuł: "+ film_title);
        System.out.println("Rząd: "+ row);
        System.out.println("Miejsce: "+ seat);
        System.out.println("Cena biletu: "+ price);
        
    }
    
    public static void main(String[] args){
        CinemaTicket2 c1 = new CinemaTicket2("Gladiator",2,"10");
        c1.ticketData();
        
        
    }
}