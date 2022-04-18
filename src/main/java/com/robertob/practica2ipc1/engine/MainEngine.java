package com.robertob.practica2ipc1.engine;

import com.robertob.practica2ipc1.engine.character.Player;
import com.robertob.practica2ipc1.frames.*;

public class MainEngine {
    
    public Player player = new Player();
    
   public void startMainGame(){
       
       new WelcomeFrame().setVisible(true);
       
   
   }
   
}
