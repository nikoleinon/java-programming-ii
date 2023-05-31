import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility(){
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item){
        this.storage.putIfAbsent(unit, new ArrayList<>());

        // let's first retrieve the list containing the exercises completed by the user and add to it
        ArrayList<String> completed = this.storage.get(unit);
        completed.add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        ArrayList<String> emptyList = new ArrayList<>();

        return this.storage.getOrDefault(storageUnit, emptyList);
    }
    public ArrayList<String> storageUnits() {
        ArrayList<String> nonEmptyUnits = new ArrayList<>();
        for (String storageUnit : storage.keySet()) {
            if (!storage.get(storageUnit).isEmpty()) {
                nonEmptyUnits.add(storageUnit);
            }
        }
        return nonEmptyUnits;
    }
    public void remove(String storageUnit, String item) {
        List<String> items = storage.get(storageUnit);
        if (items != null) {
            items.remove(item);
            if (items.isEmpty()) {
                storage.remove(storageUnit);
            }
        }
    }
}

