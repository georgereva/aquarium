package com.georgereva.aquarium.objects.fishes;

import com.georgereva.aquarium.objects.aquarium.Aquarium;
import com.georgereva.aquarium.objects.aquarium.PointInAquarium;
import com.georgereva.auarium.interfaces.PredatorFishActions;

public class Predator extends Fish implements PredatorFishActions {

    public Predator() {
        super();
    }

    public Predator(String name, int old, int finalOld) {
        super(name, old, finalOld);
    }

    public Predator(PointInAquarium pointInAquarium, Aquarium aquarium, String name, int old, int finalOld) {
        super(pointInAquarium, aquarium, name, old, finalOld);
    }

    public void eat(Prey preyFish) {

    }

    public void move() {

    }

    public void death() {

    }


}
