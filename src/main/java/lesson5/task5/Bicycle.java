package lesson5.task5;

public class Bicycle implements Vehicle {
    private boolean hasGears;

    public Bicycle(boolean hasGears) {
        this.hasGears = hasGears;
    }

    public boolean hasGears() {
        return hasGears;
    }

}