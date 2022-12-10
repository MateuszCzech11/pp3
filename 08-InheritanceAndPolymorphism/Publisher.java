public class Publisher {
    String name;
    String city;


    public Publisher(String name, String city) {
        this.name = name;
        this.city = city;
    }


    public String getName() {
        return name;
    }


    public String getCity() {
        return city;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setCity(String city) {
        this.city = city;
    }


    public String toString() {
        return "Publisher [name=" + name + ", city=" + city + "]";
    }
    
    
    
    
}
