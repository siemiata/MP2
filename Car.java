public class Car {
    private String make;
    private String model;
    private int year;
    private Mechanic mechanic;

    public Car(String make, String model, int year, Mechanic mechanic) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mechanic = mechanic;
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