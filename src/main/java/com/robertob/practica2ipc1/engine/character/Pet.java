package com.robertob.practica2ipc1.engine.character;

public class Pet extends Thread{
    
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

    public Pet(String type, String nick) {
        this.type = type;
        this.nick = nick;
    }  
    
    private void setPetIsAlive(){
        if(foodRequests == maxFoodRequests || sickness == 6){
            petIsAlive = false;
        }
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

}
