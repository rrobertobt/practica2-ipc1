/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robertob.practica2ipc1.engine.consumables;

import com.robertob.practica2ipc1.engine.character.Pet;

/**
 *
 * @author robertob
 */
public class Analgesic extends Med {
    
    public Analgesic() {
        type = "Analgesico";
        price = 50;
    }

    @Override
    public void boost(Pet petToBoost) {
        if(petToBoost.getSickness() != 0 && petToBoost.getSickness() >= 2){
            petToBoost.setSickness(petToBoost.getSickness() - 2);
        }
    }
    
}
