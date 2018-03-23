package rocket;

import engine.Engine;
import rocket.cabin.Cabin;

public class Rocket implements IFlyable {

    protected int tankVolume = 500;
    public Engine engine;

    public Cabin cabin = Cabin.getCabin("VIP");

}
