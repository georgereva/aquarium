package com.georgereva.aquarium.objects.fishes;

import com.georgereva.aquarium.objects.aquarium.Aquarium;
import com.georgereva.aquarium.objects.aquarium.AquariumObject;
import com.georgereva.aquarium.objects.aquarium.PointInAquarium;
import com.georgereva.auarium.interfaces.FishActions;

public abstract class Fish extends AquariumObject implements FishActions {
    private String name;
    private int old;
    private int finalOld;

    public Fish() {
        super();
    }

    public Fish(String name, int old, int finalOld) {
        this.name = name;
        this.old = old;
        this.finalOld = finalOld;
    }

    public Fish(PointInAquarium pointInAquarium, Aquarium aquarium, String name, int old, int finalOld) {
        super(pointInAquarium, aquarium);
        this.name = name;
        this.old = old;
        this.finalOld = finalOld;
    }
}
