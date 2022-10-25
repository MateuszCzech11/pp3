public class Counter{
    int value = 0;
    
    public void Increment(){
        value +=1;
    }
    
    public void Decrement(){
        value +=1;
    }
    
    public void Increase10(){
        value +=10;
    }
    
    public void Decrease10(){
        value +=10;
    }
    
    public void Reset(){
        value = 0;
    }
    
    public static void main(String[] args){
        Counter c1 = new Counter();
        for (int i =0;i<2;i++){
            c1.Increase10();
        }
        
        for (int i=0;i<3;i++){
            c1.Increment();
        }   
        
        
        Counter c2 = new Counter();
        for (int i =0; i<4; i++){
            c2.Decrease10();
        }
        
        for (int i =0; i<7; i++){
            c2.Decrement();
        }
        System.out.println(c1.value);
        System.out.println(c2.value);
    }
}