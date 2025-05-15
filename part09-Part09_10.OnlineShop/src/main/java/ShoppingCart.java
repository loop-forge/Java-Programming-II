import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> cart = new HashMap<>();

    public void add(String product, int price){
        Item selected = new Item(product, 1, price);
        for (Item it : cart.values()) {
            if (it.equals(selected)) {
                it.increaseQuantity();
				return;
			}
		}
        cart.putIfAbsent(product, selected);
    }

    public int price(){
        int totalPrice = 0;
        for(Item itm : cart.values()){
            totalPrice += itm.getUnitPrice()*itm.getQty();
        }
        return totalPrice;
    }
    
    public void print(){
        for(Item product : cart.values()){
            System.out.println(product.getProduct() + ": " + product.getQty());
        }
    }
}
