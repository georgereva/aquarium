package com.georgereva.auarium.interfaces;

import com.georgereva.aquarium.objects.fishes.Prey;

public interface PredatorFishActions extends FishActions {
    void eat(Prey preyFish);
}
