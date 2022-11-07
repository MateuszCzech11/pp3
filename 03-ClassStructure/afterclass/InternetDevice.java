public class InternetDevice{
    String name;
    boolean connected=false;
    static int connectedDevices =0;
    
    public InternetDevice(String name){
        this.name= name;
    }
    
    public void connect(){
        connected = true;
        connectedDevices+=1;
    }
    
    public void disconnect(){
        connected = false;
        connectedDevices-=1;
    }
    
    public void isConnected(){
        if (connected){
            System.out.println("Device is connected");
        } else{
            System.out.println("Device is NOT connected");
        }
    }
    
    public void displayStatus(){
        System.out.println("Device connected: "+ connected);
    }
    
    public static void displayConnections(){
        System.out.println("Amount of devices connected: "+ connectedDevices);
    }
    
    public static void main(String[] args){
        InternetDevice i1= new InternetDevice("Phone");
        i1.connect();
        InternetDevice i2= new InternetDevice("TV");
        i2.connect();
        displayConnections();
        i1.disconnect();
        displayConnections();
    }
}