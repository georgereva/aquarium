package com.georgereva.aquarium.objects.fishes;

import com.georgereva.aquarium.objects.aquarium.Aquarium;
import com.georgereva.aquarium.objects.aquarium.PointInAquarium;
import com.georgereva.aquarium.objects.seaweeds.Seaweed;
import com.georgereva.auarium.interfaces.PreyFishActions;

public class Prey extends Fish implements PreyFishActions {

    public Prey() {
        super();
    }

    public Prey(String name, int old, int finalOld) {
        super(name, old, finalOld);
    }

    public Prey(PointInAquarium pointInAquarium, Aquarium aquarium, String name, int old, int finalOld) {
        super(pointInAquarium, aquarium, name, old, finalOld);
    }

    public void eat(Seaweed seaweed) {

    }

    public void move() {

    }

    public void death() {

    }
}
