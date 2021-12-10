package edu.wctc.maze;

public class CharlesCherub implements Companion{
    @Override
    public String getName()
    {
        return "Charles the Cherub";
    }
    @Override
    public void update(String whatHappened)
    {
        if(whatHappened == "Score change")
        {
            PrintQueue.enqueue("Congratulations! You got more points!");
        }
        else if(whatHappened == "Item pickup")
        {
            PrintQueue.enqueue("Nice job! You picked up an item! It might be valuable.");
        }
    }
    @Override
    public void notifyObserver(String whatHappened)
    {
        update(whatHappened);
    }
}
