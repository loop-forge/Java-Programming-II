import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry(){
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        return true;
    }

    public String get(LicensePlate licensePlate){
        return "";    
    }

    public boolean remove(LicensePlate licensePlate){
        return true;
    }

    public void printLicensePlates(){

    }

    public void printOwners(){

    }
}
