package rocket;

import destinations.Planets;
import engine.Engine;
import rocket.cabin.Cabin;
import rocket.fuelTank.FuelTank;
import spaceCalculations.SpaceCalculations;

import java.math.BigDecimal;

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

    public BigDecimal getTimeTrip() {
        return SpaceCalculations.observerTravelTime(Planets.MARS.getDistanceMeters(), 9.8f);
    }

    public BigDecimal getMaximumVelocity() {
        return SpaceCalculations.maximumVelocity(Planets.MARS.getDistanceMeters(), 9.8f);
    }

    public BigDecimal getFuelNeeds() {
        return SpaceCalculations.fuelNeeds(Planets.MARS.getDistanceMeters(), 9.8f, 25000, 0.8f);
    }
}
