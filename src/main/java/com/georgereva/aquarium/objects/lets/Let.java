package com.georgereva.aquarium.objects.lets;

import com.georgereva.aquarium.objects.aquarium.Aquarium;
import com.georgereva.aquarium.objects.aquarium.AquariumObject;
import com.georgereva.aquarium.objects.aquarium.PointInAquarium;

public class Let extends AquariumObject {
    private String name;

    public Let() {
        super();
    }

    public Let(String name) {
        this.name = name;
    }

    public Let(PointInAquarium pointInAquarium, Aquarium aquarium, String name) {
        super(pointInAquarium, aquarium);
        this.name = name;
    }
}
