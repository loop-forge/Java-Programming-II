import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility(){
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item){
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        if(this.storage.containsKey(storageUnit)){
            return this.storage.get(storageUnit);
        } else {
            ArrayList<String> empty = new ArrayList<>();
            return empty;
        }
    }

    public void remove(String storageUnit, String item){
        if(this.storage.containsKey(storageUnit) &&  !this.storage.get(storageUnit).isEmpty()){
            this.storage.get(storageUnit).remove(item);
            if(this.storage.get(storageUnit).isEmpty()){
                this.storage.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> storageUnits = new ArrayList<>();
        for(String key : this.storage.keySet()){
            storageUnits.add(key);
        }
        return storageUnits;
    }
}
