public class BankAccount{
    double stan_konta;
    String imie_wlasciciela;
    String nazwisko_wlasciciela;
    boolean czy_aktywne;
    String data_zalozenia;
    
    public void WyswietlStanKonta(){
        System.out.println("Saldo rachunku: "+ stan_konta);
    }
    
    public void ZamknijKonto(){
        czy_aktywne = false;
        System.out.println("Konto zostało zamknięte.");
    }
    
    public void WyswietlInformacje(){
        System.out.println("Właściciel: " + imie_wlasciciela + " " + nazwisko_wlasciciela);
        System.out.println("Data założenia konta: " + data_zalozenia);
        System.out.println("Czy konto jest aktywne: "+ czy_aktywne);
    }
}