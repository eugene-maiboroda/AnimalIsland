package Animals.species.herbivore;

import Animals.Animal;
import Animals.Herbivore;

public class Caterpillar extends Herbivore {
    public Caterpillar() {
        setWeight(0.01);
        setMaxOnCell(1000);
        setSpeed(0);
        setHungryPoints(0.003);
        setHealthPoints(0.003);
    }

    public Animal reproduce() {
        return new Caterpillar();
    }
}
