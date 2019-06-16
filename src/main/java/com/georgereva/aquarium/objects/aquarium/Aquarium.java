package com.georgereva.aquarium.objects.aquarium;


import java.util.List;

public class Aquarium {
    private int[][] aquariumSpace;
    private List<AquariumObject> aquariumObjects;

    public Aquarium() {
    }

    public Aquarium(int[][] aquariumSpace, List<AquariumObject> aquariumObjects) {
        this.aquariumSpace = aquariumSpace;
        this.aquariumObjects = aquariumObjects;
    }

    public int[][] getAquariumSpace() {
        return aquariumSpace;
    }

    public void setAquariumSpace(int[][] aquariumSpace) {
        this.aquariumSpace = aquariumSpace;
    }

    public List<AquariumObject> getAquariumObjects() {
        return aquariumObjects;
    }

    public void setAquariumObjects(List<AquariumObject> aquariumObjects) {
        this.aquariumObjects = aquariumObjects;
    }
}
