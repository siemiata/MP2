public class Repair {
    private Mechanic mechanic;
    private double cost;

    public Repair(Mechanic mechanic, double cost) {
        this.mechanic = mechanic;
        this.cost = cost;
    }
    public Mechanic getMechanic() {
        return mechanic;
    }
    public double getCost() {
        return cost;
    }
}