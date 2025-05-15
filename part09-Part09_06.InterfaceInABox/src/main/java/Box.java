import java.util.ArrayList;

public class Box implements Packable {
    private ArrayList<Packable> items;
    private double maximumCapacity;

    public Box(double maximumCapacity){
        this.maximumCapacity=maximumCapacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable item){
        if(weight()+item.weight()<=maximumCapacity){
            items.add(item);
        }
    }

    public double weight() {
        double weight = 0;
        // calculate the total weight of the items in the box
        for(Packable item : items){
            weight+= item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items" + ", " + "total weight " + weight() + " kg";
    }
    
}
