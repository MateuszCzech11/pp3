public class Product{
    private String name;
    private boolean is_vege;

    public String getName(){
        return name;
    }

    public boolean getIsVege(){
        return is_vege;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setIsVege(boolean is_vege){
        this.is_vege = is_vege;
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setName("Banan");
        p1.setIsVege(true);
        System.out.println(p1.getName() + "\n"+ p1.getIsVege());
    }
}