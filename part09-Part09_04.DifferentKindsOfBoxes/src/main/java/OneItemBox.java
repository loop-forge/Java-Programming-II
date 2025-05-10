import java.util.ArrayList;

public class OneItemBox extends Box {
    private int capacity = 1;
    private ArrayList<Item> items;

    public OneItemBox(){
        this.items=new ArrayList<>();
    }


    public void add(Item item){
        if(items.size()<capacity){
            items.add(item);
        }
    }

    public boolean isInBox(Item item){
        for(Item inbox: items){
            if(item.hashCode() == inbox.hashCode()){
                return true;
            }
        }
        return false;
    }
}
