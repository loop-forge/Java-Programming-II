import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> products = new HashMap<String, Integer>();
    private Map<String, Integer> stocks = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock){
        products.put(product, price);
        stocks.put(product, stock);
    }
    public int price(String product){
        if(products.containsKey(product)){
            return products.get(product);
        } else {
            return -99;
        }
    }
    public int stock(String product){
        if(stocks.containsKey(product)){
            return stocks.get(product);
        } else {
            return 0;
        }
    }
    public boolean take(String product){
        if(stocks.containsKey(product) && stock(product)>0){
            int newStock = stocks.get(product) - 1;
            stocks.put(product, newStock);
            return true;
        } 
        return false;
    }

    public Set<String> products(){
        Set<String> productsList = new HashSet<String>();
        for(String product : products.keySet()){
            productsList.add(product);
        }
        return productsList;
    }
}
