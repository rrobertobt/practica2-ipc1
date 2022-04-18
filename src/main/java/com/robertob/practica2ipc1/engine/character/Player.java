package com.robertob.practica2ipc1.engine.character;

public class Player {
    
    private Pet[] playerPets = new Pet[10];
    private int money = 100;
    private int wonBattles = 0;
    private int lostBattles = 0;
    private int currentIndex = 0;

    public int getCurrentIndex() {
        return currentIndex;
    }

    public Pet getPlayerPets(int index) {
        return playerPets[index];
    }

    public void setPlayerPets(Pet newPet) {
        this.playerPets[currentIndex] = newPet;
        currentIndex += 1;
    }

    public int getWonBattles() {
        return wonBattles;
    }

    public void setWonBattles(int wonBattles) {
        this.wonBattles = wonBattles;
    }

    public int getLostBattles() {
        return lostBattles;
    }

    public void setLostBattles(int lostBattles) {
        this.lostBattles = lostBattles;
    }

    public int getMoney() {
        return money;
    }

    public void lowerMoney(int money) {
        this.money -= money;
    }
    
    public boolean playerCanBuyPet(){
        return this.money >= 50;
    }
    
    public boolean playerCanRevive(){
        return this.money >= 15;
    }
    
}
