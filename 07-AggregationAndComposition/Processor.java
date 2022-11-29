public class Processor{
    double clockRate;
    String socket;
    String brand;
    int cache;
    int cores;
    

    public Processor(double clockRate, String socket, String brand, int cache, int cores) {
        this.clockRate = clockRate;
        this.socket = socket;
        this.brand = brand;
        this.cache = cache;
        this.cores = cores;
    }

    public void changeClockRate(double newRate){
        this.clockRate = newRate;
    }

    public double sumNumbers(double a, double b){
        return a+b;
    }

    public double subtractNumbers(double a, double b){
        return a-b;
    }

    public String toString(){
        return "Marka: " + brand + "Socket: " + socket + "Taktowanie: "+ clockRate +
        "Pamiec wewnetrzna: " + cache + "Ilosc rdzeni: " + cores;
    }
}