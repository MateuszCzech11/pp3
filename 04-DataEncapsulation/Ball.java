public class Ball{
    private String type;
    private String color;
    private int radius;

    Ball(String type, String color, int radius){
        this.type = type;
        this.color = color;
        this.radius = radius;
    }

    public String getType(){
        return type;
    }
    
    public String getColor(){
        return color;
    }

    public int getRadius(){
        return radius;
    }

    public void DisplayInfo(){
        System.out.println(getType() + getColor() + getRadius());
    }

    public static void main(String[] args){
        Ball b1 = new Ball("BaSKET", "orang",4);
        b1.DisplayInfo();
        System.out.println(b1.type);
    }
}