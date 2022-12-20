public class Triangle extends Shape {
    private double a;
    private double h;
    private double b;
    private double c;


public Triangle(double a, double h, double b, double c) {
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
    }

public double area() {
    return (a*h)/2;
    }

public double peremiter() {
        return a+h+c;
    }

public double getA() {
    return a;
}

public double getH() {
    return h;
}

public void setA(double a) {
    this.a = a;
}

public void setH(double h) {
    this.h = h;
}


}
