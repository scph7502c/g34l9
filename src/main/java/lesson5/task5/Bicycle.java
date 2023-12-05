package lesson5.task5;

public class Bicycle implements NonMotorVehicle {

    private boolean hasGears;

    public Bicycle(boolean hasGears) {
        this.hasGears = hasGears;
    }

    @Override
    public boolean hasGears() {
        return hasGears;
    }
}