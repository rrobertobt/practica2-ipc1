package com.robertob.practica2ipc1.engine.consumables;
import com.robertob.practica2ipc1.engine.character.*;

public abstract class Food {
    
    String type;
    int price;

    public int getPrice() {
        return price;
    }
    
    public String getType() {
        return type;
    }
    
    public abstract void boost(Pet petToBoost);
    
}
