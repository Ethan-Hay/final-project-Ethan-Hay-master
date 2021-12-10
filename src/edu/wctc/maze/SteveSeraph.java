package edu.wctc.maze;

public class SteveSeraph implements Companion{
    @Override
    public String getName()
    {
        return "Steve the Seraph";
    }
    @Override
    public void update(String whatHappened)
    {
        if(whatHappened == "Score change")
        {
            PrintQueue.enqueue("You scored. Don't get cocky.");
        }
        else if(whatHappened == "Item pickup")
        {
            PrintQueue.enqueue("Greed is a sin you know.");
        }
    }
    @Override
    public void notifyObserver(String whatHappened)
    {
        update(whatHappened);
    }
}
