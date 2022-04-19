package com.robertob.practica2ipc1.engine.consumables;
import com.robertob.practica2ipc1.engine.*;
import com.robertob.practica2ipc1.engine.character.*;

public class Apple extends Food {

    public Apple() {
        type = "Manzana";
        price = 10;
    }
    
    @Override
    public void boost(Pet petToBoost){
        petToBoost.setMaxFoodRequests(5);
        petToBoost.setFoodRequests(0);
    }

}
