package edu.wctc.maze;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private boolean playing = true;

    private int score = 0;

    private List<String> inventory = new ArrayList<>();

    private List<Companion> companions = new ArrayList<>();
    public void recruitCompanion(Companion e){
        companions.add(e);
    }
    public void removeCompanion(Companion e){
        companions.remove(e);
    }
    public void addToInventory(String item) {
        inventory.add(item);

        for(var companion : companions)
        {
            companion.notifyObserver("Item pickup");
        }
    }

    public void addToScore(int points) {
        score += points;

        for(var companion : companions)
        {
            companion.notifyObserver("Score change");
        }
    }

    public String getInventory() {
        if (inventory.isEmpty()) {
            return "Your pockets are empty!";
        }

        String inv = "You are carrying: ";
        inv += String.join(", " , inventory);

        return inv;
    }

    public int getScore() {
        return score;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void quit() {
        playing = false;
    }

}
