package edu.wctc.maze;

public class DougDevil implements Companion{
    @Override
    public String getName()
    {
        return "Doug the Devil";
    }
    @Override
    public void update(String whatHappened)
    {
        if(whatHappened == "Score change")
        {
            PrintQueue.enqueue("Yay! More points! More points!");
        }
        else if(whatHappened == "Item pickup")
        {
            PrintQueue.enqueue("Ooh! Shinies!");
        }
    }
    @Override
    public void notifyObserver(String whatHappened)
    {
        update(whatHappened);
    }
}
