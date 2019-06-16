package com.georgereva.aquarium.objects.seaweeds;

import com.georgereva.aquarium.objects.aquarium.Aquarium;
import com.georgereva.aquarium.objects.aquarium.AquariumObject;
import com.georgereva.aquarium.objects.aquarium.PointInAquarium;

public class Seaweed extends AquariumObject {
    private String name;

    public Seaweed() {
        super();
    }

    public Seaweed(String name) {
        this.name = name;
    }

    public Seaweed(PointInAquarium pointInAquarium, Aquarium aquarium, String name) {
        super(pointInAquarium, aquarium);
        this.name = name;
    }
}
