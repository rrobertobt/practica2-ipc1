package com.robertob.practica2ipc1.engine;

import com.robertob.practica2ipc1.engine.character.Pet;
import com.robertob.practica2ipc1.engine.character.Player;
import com.robertob.practica2ipc1.frames.*;

public class MainEngine {
    
   public Player player = new Player();
   
   public void buyPet(String type, String nick){
       Pet newPet = new Pet(type, nick);
       player.setPlayerPets(newPet);
       player.lowerMoney(50);
   }
   
   public void startMainGame(){
       new WelcomeFrame().setVisible(true);
   }
   
}
