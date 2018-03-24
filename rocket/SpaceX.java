package rocket;

import engine.Engine;
import rocket.cabin.Cabin;
import rocket.fuelTank.FuelTank;

public class SpaceX extends Rocket {

    private int weight = 18000;

    public void setCabin(String cabinType) {
        this.cabin = Cabin.getCabin(cabinType);
    }

    public void setEngine(String engineType) {
        this.engine = new Engine(engineType);
    }

    public void setFuelTank(String fuelTankType) {
        this.fuelTank = new FuelTank(fuelTankType);
    }

    @Override
    public int getWeight() {
        return this.weight;
    }
}
