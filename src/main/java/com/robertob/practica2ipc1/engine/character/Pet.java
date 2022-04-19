package com.robertob.practica2ipc1.engine.character;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Pet implements Runnable{
    
    private String type;
    private String nick;
    private int level = 1;
    private int sickness = 0;
    private int foodRequests = 0;
    private int maxFoodRequests = 5;
    private int dirtiness = 0;
    private int walkRequests = 0;
    private boolean petIsAlive = true;
    private int revivePrice = ((5*level)+10);
    private int age;
    private int maxAge;
    private int timesAte = 0;
    
    //Intervalos para pedir comida, excretar, paseo
    private int requestFoodInterval = 4000;
    public Thread tPet;

    
    @Override
    public void run(){
        while (true) {            
            askForFood();
        }
    }
    
    private void askForFood(){
        if (petIsAlive){
            try {
                tPet.sleep(requestFoodInterval);
            } catch (InterruptedException ex) {
                Logger.getLogger(Pet.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "La mascota "+ this.nick +" tiene hambre", "Mascota tiene hambre", JOptionPane.INFORMATION_MESSAGE);
            this.foodRequests++;
            checkPetIsAlive();
        } else if (!petIsAlive){
            JOptionPane.showMessageDialog(null, "La mascota "+ this.nick +" ha muerto de hambre", "Mascota ha muerto", JOptionPane.INFORMATION_MESSAGE);
            tPet.suspend();
        }
        

            
    }
    private void excrete(){
        if(timesAte == 2){dirtiness = 1;}
    }
    
    public void eat(int newMaxFoodRequests){
        
    }
    
    private void askForWalk(){}
    
    public Pet(String type, String nick) {
        this.type = type;
        this.nick = nick;
        tPet = new Thread(this);
        tPet.start();
    }  
    
    private void checkPetIsAlive(){
        if(foodRequests == maxFoodRequests || sickness == 6){
            petIsAlive = false;
        }
    }
    
    public void setPetAlive(boolean status){
        this.petIsAlive = status;
    }
    
    public boolean isPetAlive(){
        return petIsAlive;
    }
    
    public void revive(){
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSickness() {
        return sickness;
    }

    public void setSickness(int sickness) {
        this.sickness = sickness;
    }

    public int getFoodRequests() {
        return foodRequests;
    }

    public void setFoodRequests(int foodRequests) {
        this.foodRequests = foodRequests;
    }

    public int getMaxFoodRequests() {
        return maxFoodRequests;
    }

    public void setMaxFoodRequests(int maxFoodRequests) {
        this.maxFoodRequests = maxFoodRequests;
    }

    public int getDirtiness() {
        return dirtiness;
    }

    public void setDirtiness(int dirtiness) {
        this.dirtiness = dirtiness;
    }

    public int getWalkRequests() {
        return walkRequests;
    }

    public void setWalkRequests(int walkRequests) {
        this.walkRequests = walkRequests;
    }

    public int getRevivePrice() {
        return revivePrice;
    }

    
}
