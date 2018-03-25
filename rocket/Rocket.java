package rocket;

import engine.Engine;
import rocket.cabin.Cabin;
import rocket.fuelTank.FuelTank;

public class Rocket implements IPotentiallyFlyable {

    private int weight = 28000; // default Rocket weight

    private Cabin cabin;
    private Engine[] engines;
    private FuelTank[] fuelTanks;

    public void assembleRocket(String cabin, Engine[] engines, FuelTank[] fuelTanks) {
        setCabin(cabin);
        setEngines(engines);
        setFuelTanks(fuelTanks);
    }

    public void start() {
        this.cabin.start(this.engines);
    }

    private void setCabin(String cabinType) {
        this.cabin = Cabin.getCabin(cabinType);
    }

    private void setEngines(Engine[] engines) {
        this.engines = engines;
    }

    private void setFuelTanks(FuelTank[] fuelTanks) {
        this.fuelTanks = fuelTanks;
    }


    public int getWeight() {
        return weight;
    }

    public float getAccelerationAverage() {
        float total = 0f;
        int counts = this.engines.length;

        for(Engine engine : engines) {
            total += ( engine.getAcceleration1() + engine.getAcceleration2() ) / 2;
        }

        return total / counts;
    }

    public int getTotalWeight() {
        int totalEngineWeight = 0;
        int totalFuelTankWeight = 0;

        for(Engine engine : engines) {
            totalEngineWeight += engine.getWeight();
        }

        for(FuelTank fuelTank : fuelTanks) {
            totalFuelTankWeight += fuelTank.getWeight();
        }

        return getWeight() + totalEngineWeight + totalFuelTankWeight + this.cabin.getWeight() + this.cabin.getCapacity() * 80;
    }

    public int getTotalFuel() {
        int totalFuel = 0;

        for(FuelTank fuelTank : fuelTanks) {
            totalFuel += fuelTank.getCapacity();
        }

        return totalFuel;
    }

    public float getEfficiencyAverage() {
        float total = 0f;
        int counts = this.engines.length;

        for(Engine engine : engines) {
            total += engine.getPower();
        }

        return total / counts;
    }

    public Cabin getCabin() {
        System.out.println(cabin.toString());
        return cabin;
    }

    public Engine[] getEngines() {
        System.out.println("\nYour spaceship has the below engines: ");
        for(Engine engine : engines) {
            System.out.println(engine.toString());
        }
        return engines;
    }

    public FuelTank[] getFuelTanks() {
        System.out.println("\nYour spaceship has the below fuel tanks: ");
        for(FuelTank fuelTank : fuelTanks) {
            System.out.println(fuelTank.toString());
        }
        return fuelTanks;
    }
}
