package src.cabin;

import src.engine.Engine;

public interface Cabin {
    String getName();
    int getWeight();
    int getCapacity();
    void start(Engine[] engines);
}
