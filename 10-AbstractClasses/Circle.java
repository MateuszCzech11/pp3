public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double area(){
        return Math.PI*(r*r);
    }

    public double peremiter(){
        return 2*r*3.14;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    
}
