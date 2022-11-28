import java.util.ArrayList;
import java.util.Scanner;
public class ShoppingList {
    ArrayList<String> productList = new ArrayList<String>();

    public String displayList(){
        String productString = "";
        for (String i: productList){
            productString= productString + i + " ";
        }
        return productString;
    }

    public void addProduct(String product){
        productList.add(product);
    }

    public int listLenght(){
        return productList.size();
    }

    public void addProductKeyboard(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj nazwe produktu: ");
        String product = keyboard.nextLine();
        productList.add(product);
        keyboard.close();
    }


    public static void main(String[] args) {
        ShoppingList s = new ShoppingList();
        System.out.println(s.displayList());
        s.addProduct("mleko");
        s.addProduct("jajo");
        System.out.println(s.displayList());
        System.out.println(s.listLenght());
        s.addProduct("pomidor");
        System.out.println(s.displayList());
        s.addProductKeyboard();
        System.out.println(s.displayList());
    }
}
