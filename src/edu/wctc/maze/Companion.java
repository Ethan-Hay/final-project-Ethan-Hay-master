package edu.wctc.maze;

public interface Companion {
    String getName();
    void update(String whatHappened);
    void notifyObserver(String whatHappened);
}
