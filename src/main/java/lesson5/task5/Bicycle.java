package lesson5.task5;

public class Bicycle implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Rower nie ma silnika.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Rower nie ma silnika.");
    }

    @Override
    public boolean isEngineStarted() {
        return false;
    }
}