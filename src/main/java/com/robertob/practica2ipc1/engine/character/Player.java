package com.robertob.practica2ipc1.engine.character;

public class Player {
    
    private Pet[] playerPets;
    private int wonBattles;
    private int lostBattles;

    public Pet[] getPlayerPets() {
        return playerPets;
    }

    public void setPlayerPets(Pet[] playerPets) {
        this.playerPets = playerPets;
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
    
}
