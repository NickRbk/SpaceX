public class SpaceX extends Rocket {

    // some specific properties for SpaceX may be here

    public SpaceX(int tankVolume) {
        if(tankVolume < 500) {
            System.out.println("Set default value 500, cuz min value");
        } else {
            this.tankVolume = tankVolume;
            System.out.println("Fueling tanks for " + tankVolume + " units. Good journey!");
        }
    }

}
