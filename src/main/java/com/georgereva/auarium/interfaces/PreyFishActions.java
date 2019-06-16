package com.georgereva.auarium.interfaces;

import com.georgereva.aquarium.objects.seaweeds.Seaweed;

public interface PreyFishActions extends FishActions {
    void eat(Seaweed seaweed);
}
