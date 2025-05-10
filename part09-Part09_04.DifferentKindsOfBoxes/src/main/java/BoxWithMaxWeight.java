import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void add(Item item){
        int currentWeight = 0;
        for(Item inbox : items){
            currentWeight += inbox.getWeight();
        }

        if(maxWeight>=currentWeight + item.getWeight()){
            items.add(item);
            currentWeight+=item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item){
        for(Item inbox: items){
            if(item.hashCode() == inbox.hashCode()){
                return true;
            }
        }
        return false;
    }
}
