public class Smartphone{
    boolean czy_wlaczony;
    String model;
    int rok_produkcji;
    double wysokość;
    double szerokość;
    
    public void Uruchom(){
        czy_wlaczony = true;
    }
    
    public void Wylacz(){
        czy_wlaczony = false;
    }
    
    public void Zadzwon(){
        System.out.println("Dzwonienie...");
    }
}