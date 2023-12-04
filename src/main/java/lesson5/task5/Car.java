package lesson5.task5;

public class Car implements Vehicle {
    private boolean engineStarted;

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