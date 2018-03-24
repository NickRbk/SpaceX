package rocket;

import engine.Engine;
import rocket.cabin.Cabin;
import rocket.fuelTank.FuelTank;

public class Rocket implements IFlyable {

    private int weight = 22000; // default Rocket weight

    Cabin cabin;
    Engine engine;
    FuelTank fuelTank;

    public void setCabin(String cabinType) {
        this.cabin = Cabin.getCabin(cabinType);
    }

    public void setEngine(String engineType) {
        this.engine = new Engine(engineType);
    }

    public void setFuelTank(String fuelTankType) {
        this.fuelTank = new FuelTank(fuelTankType);
    }

    public int getWeight() {
        return weight;
    }

    public Cabin getCabin() {
        return cabin;
    }

    public Engine getEngine() {
        return engine;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }
}
