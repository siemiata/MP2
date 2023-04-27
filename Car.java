import java.util.HashMap;
import java.util.Map;

public class Car {
    private String make;
    private String model;
    private int year;
    private Mechanic mechanic;
    private Repair repair;
    private Map<Mechanic, Repair> repairs = new HashMap<>();
    private Engine engine;

    public Car(String make, String model, int year, Mechanic mechanic, Repair repair) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mechanic = mechanic;
        this.repair = repair;
        this.engine = new Engine();
    }

    public Engine getEngine() {
        return engine;
    }

    public void addRepair(Mechanic mechanic, Repair repair) {
        repairs.put(mechanic, repair);
    }

    public Repair getRepair() {
        return repair;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }
}