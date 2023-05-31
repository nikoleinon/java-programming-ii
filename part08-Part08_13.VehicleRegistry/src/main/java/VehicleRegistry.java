import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!registry.containsKey(licensePlate)) {
            registry.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        return registry.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            registry.remove(licensePlate);
            return true;
        }
        return false; 
    }
    public void printLicensePlates() {
        for (LicensePlate licensePlate : registry.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        Set<String> printedOwners = new HashSet<>();
        for (String owner : registry.values()) {
            if (!printedOwners.contains(owner)) {
                System.out.println(owner);
                printedOwners.add(owner);
            }
        }
    }
}
