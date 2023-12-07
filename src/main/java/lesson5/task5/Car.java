package lesson5.task5;

public class Car implements MotorVehicle {
    private boolean engineStarted;

    public Car() {
    }

    @Override
    public void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
        }
    }

    @Override
    public void stopEngine() {
        if (engineStarted) {
            engineStarted = false;
        }
    }

    @Override
    public boolean isEngineStarted() {
        return engineStarted;
    }
}