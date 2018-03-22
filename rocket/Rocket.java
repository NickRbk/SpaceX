package rocket;

import engine.Engine;

public abstract class Rocket implements IFlyable {

    protected int tankVolume = 500;
    public Engine engine;

    public class Cabin {
        public void start(int rocketCapacity) {
           engine = new Engine(rocketCapacity);
        }
    }
}
