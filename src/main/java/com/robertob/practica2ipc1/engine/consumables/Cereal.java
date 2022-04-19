package com.robertob.practica2ipc1.engine.consumables;

import com.robertob.practica2ipc1.engine.character.*;

public class Cereal extends Food {

    public Cereal() {
        type = "Cereal";
        price = 30;
    }
    
    @Override
    public void boost(Pet petToBoost){
        petToBoost.setMaxFoodRequests(7);
        petToBoost.setFoodRequests(0);

    }
    
}
