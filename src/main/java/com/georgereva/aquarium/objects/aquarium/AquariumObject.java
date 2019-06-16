package com.georgereva.aquarium.objects.aquarium;

public abstract class AquariumObject {
    private PointInAquarium pointInAquarium;
    private Aquarium aquarium;

    public AquariumObject() {
    }

    public AquariumObject(PointInAquarium pointInAquarium, Aquarium aquarium) {
        this.pointInAquarium = pointInAquarium;
        this.aquarium = aquarium;
    }
}
