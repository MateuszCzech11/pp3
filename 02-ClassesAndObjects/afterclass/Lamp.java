public class Lamp{
    
    boolean is_on;   
    
    public void TurnOn(){
        is_on = true;
    }
    
    public void TurnOff(){
        is_on = false;
    }
    
    public void DisplayStatus(){
        if (is_on){
            System.out.println("Lampa jest wlaczona");
        } else{
            System.out.println("Lampa jest wylaczona");
        }
        
    }
    
    public static void main(String[] args){
        Lamp l1 = new Lamp();
        Lamp l2 = new Lamp();
        
        l1.TurnOn();
        l2.TurnOff();
        
        l1.DisplayStatus();
        l2.DisplayStatus();    
    }
}