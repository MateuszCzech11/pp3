public class Car extends Vehicle {
    int maxSpeed;

    public Car(int s, int maxSpeed) {
        super(s);
        this.maxSpeed = maxSpeed;
    }
    
    public int[] spec(){
        int[] g = new int[2];
        g[0]=getSeats();
        g[1]=maxSpeed;
        return g;

    }
}