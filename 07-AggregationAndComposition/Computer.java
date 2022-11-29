public class Computer {
    String operatingSys;
    int age;
    boolean isOn;
    Processor processor;

      

    public Computer(String operatingSys, int age, boolean isOn) {
        this.operatingSys = operatingSys;
        this.age = age;
        this.isOn = isOn;
        this.processor = new Processor(3.5, "2311", "Intel", 34, 0);
    }

    public void turnOn(){
        this.isOn = true;
    }

    public void turnOff(){
        this.isOn = false;
    }

    public double runProgramSum(double a, double b){
        return processor.sumNumbers(a,b);
    }


    public double runProgramSubtract(double a, double b){
        return processor.subtractNumbers(a,b);
    }

    public static void main(String[] args) {
        Computer c = new Computer("Windows", 1, false);
        c.runProgramSubtract(3, 5.5);
    }
}
