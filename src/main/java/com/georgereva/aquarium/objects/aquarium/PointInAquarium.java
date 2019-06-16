package com.georgereva.aquarium.objects.aquarium;

public class PointInAquarium {
    private int x;
    private int y;

    public PointInAquarium() {
    }

    public PointInAquarium(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
