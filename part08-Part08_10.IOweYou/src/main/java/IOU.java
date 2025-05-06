import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> sums;

    public IOU(){
        this.sums = new HashMap<>();
    }

    public void setSum(String toWhom, double amount){
        this.sums.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        return this.sums.getOrDefault(toWhom, 0.0);
    }
}
