import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private ArrayList<Double> changeHistory;

    public ChangeHistory(){
        this.changeHistory = new ArrayList<>();
    }

    public void add(double status){
        this.changeHistory.add(status);
    }

    public void clear() {
        changeHistory.clear();
    }

    public String toString(){
        return changeHistory.toString();
    }

    public double maxValue(){
        return Collections.max(changeHistory);
    }
    
    public double minValue(){
        return Collections.min(changeHistory);
    }

    public double average(){
        double sum=0;
        int count=0;
        for(double change : changeHistory){
            sum+=change;
            count++;
        }
        if(count>0) return 1.0*sum/count;
        else return 0;
    }
}
