public class Rocket {

    protected int tankVolume = 500;
    Engine engine;

    class Cabin {
        public void start(int rocketCapacity) {
           engine = new Engine(rocketCapacity);
        }
    }
}
