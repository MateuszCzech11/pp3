public class Room{
    int number;
    int beds;
    boolean occupied;
    String guestName;
    
    Room(int number){
        this.number = number;
        this.beds = 2;
    }
    
    Room(int number,int beds){
        this.number = number;
        this.beds = beds;
    }
    
    public void checkIn(String guestName){
        this.guestName = guestName;
    }
    
    public void checkOut(){
        this.guestName = "";
    }
    
    public boolean isOccupied(){
        return occupied;
    }
    
    public String toString(){
        return "Room number: " + number + " Beds: "+ beds + " Occupied: "+ occupied;
    }
    
    public static void main(String[] args){
        Room r0 = new Room(1);
        Room r1 = new Room(2);
        Room r2 = new Room(3);
        Room r3 = new Room(4,3);
        Room r4 = new Room(5,3);
        Room r5 = new Room(6,1);
        Room[] rooms = new Room[] {r0,r1,r2,r3,r4,r5};
        for(int i=0;i<6;i++){
            System.out.println(rooms[i]);
        }
        
    }
}