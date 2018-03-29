package src.model.cabin;

import src.model.engine.Engine;

public interface Cabin {
    String getName();
    int getWeight();
    int getCapacity();
    void start(Engine[] engines);
}
