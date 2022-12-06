public class Audiobook extends Book {

    private int minutes;
    private int seconds;
    private String filename;
    
    
    public Audiobook(String title, String author, int minutes, int seconds, String filename) {
    super(title, author);
    this.minutes = minutes;
    this.seconds = seconds;
    this.filename = filename;
    }
    
    
    public int getMinutes() {
    return minutes;
    }
    
    
    public void setMinutes(int minutes) {
    this.minutes = minutes;
    }
    
    
    public int getSeconds() {
    return seconds;
    }
    
    
    public void setSeconds(int seconds) {
    this.seconds = seconds;
    }
    
    
    public String getFilename() {
    return filename;
    }
    
    
    public void setFilename(String filename) {
    this.filename = filename;
    }
    
    public void display() {
    System.out.println();
    }
    public String toString() {
    return "dsadas";
    }
    
    
    }