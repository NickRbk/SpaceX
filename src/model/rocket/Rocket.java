package src.model.rocket;

import src.model.engine.Engine;
import src.model.fuelTank.FuelTank;

public interface Rocket {
    void assembleRocket(String cabin, Engine[] engines, FuelTank[] fuelTanks);
    void start();
    int getWeight();
    float getAccelerationAverage();
    int getTotalWeight();
    int getTotalFuel();
    float getEfficiencyAverage();
    void getCabin();
    void getEngines();
    void getFuelTanks();
}
