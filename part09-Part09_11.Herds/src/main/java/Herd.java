import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private List<Movable> organisms = new ArrayList<>();

    @Override
    public String toString(){
        String print = "";
        for(Movable organism : organisms){
            print += organism.toString() + "\n";
        }
        return print;
    }

    public void addToHerd(Movable movable){
        this.organisms.add(movable);
    }

    public void move(int dx, int dy){
        for(Movable organism : organisms){
            organism.move(dx, dy);
        }
    }
}
