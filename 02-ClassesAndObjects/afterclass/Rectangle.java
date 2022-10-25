public class Rectangle{
    int height;
    int width;
    
    public void DisplayDimensions(){
        System.out.println("Wymiary: "+ height+ "x" + width);
    }
    
    public void DisplayPeremiter(){
        int peremiter = 2* height + 2*width;
        System.out.println("Obwód wynosi: " + peremiter);
    }
    
    public void DisplayArea(){
        int area = height*width;
        System.out.println("Pole wynosi: " + area);        
    }
    
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.height = 3;
        r1.width = 5;
        r1.DisplayDimensions();
        r1.DisplayPeremiter();
        r1.DisplayArea();
        
        Rectangle r2 = new Rectangle();
        r2.height = 4;
        r2.width = 4;
        r2.DisplayDimensions();
        r2.DisplayPeremiter();
        r2.DisplayArea();  
    }
}