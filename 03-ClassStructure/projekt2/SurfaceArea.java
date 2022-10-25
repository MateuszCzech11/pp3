public class SurfaceArea{
    
    static double pi = 3.14;
    
    
    
    public static double circleArea(double radius){
        return pi*radius*radius;
    }
    
    public static double rectangleArea(double width, double height){
        return width*height;
    }
    
    public static double triangleArea(double base, double height){
        return base*height/2.0;
    }
    
    public static void main(String[] args){
        System.out.println(circleArea(7.0));
        System.out.println(rectangleArea(5.0,4.0));
        System.out.println(triangleArea(3.0,4.0));      
    }   
}

