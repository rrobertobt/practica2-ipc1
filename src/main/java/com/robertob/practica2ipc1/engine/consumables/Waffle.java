package com.robertob.practica2ipc1.engine.consumables;

import com.robertob.practica2ipc1.engine.character.*;

public class Waffle extends Food {

    public Waffle() {
        type = "Waffles";
        price = 50;
    }
    
    @Override
    public void boost(Pet petToBoost){
        petToBoost.setMaxFoodRequests(10);
        petToBoost.setFoodRequests(0);

    }
    
}
