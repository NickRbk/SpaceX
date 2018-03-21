import interfaces.IsSuccessFly;

public abstract class Rocket implements IsSuccessFly {

    protected int tankVolume = 500;
    Engine engine;

    class Cabin {
        public void start(int rocketCapacity) {
           engine = new Engine(rocketCapacity);
        }
    }
}
