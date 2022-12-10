import java.util.ArrayList;

public class ShoppingList {
    public int countlist=0;
    ArrayList<Product> shoplist = new ArrayList<Product>();

    public void add(Product product){
        shoplist.add(product);
        countlist= countlist+ product.getQuantity();
    }

    
    public String toString(){
        String list="";
        for(Product i: shoplist){
            list+=i.getName()+",";
        }
        return list.substring(0,list.length()-1);
    }

    public int total(){
        return countlist;
    }
}
