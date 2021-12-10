package edu.wctc.maze;

public class IvanImp implements Companion{
    @Override
    public String getName()
    {
        return "Ivan the Imp";
    }
    @Override
    public void update(String whatHappened)
    {
        if(whatHappened == "Score change")
        {
            PrintQueue.enqueue("You got more points. What da ya want? A cookie?");
        }
        else if(whatHappened == "Item pickup")
        {
            PrintQueue.enqueue("Oh I bet that's worth a wheelbarrel full. Of 1930's German Marks.");
        }
    }
    @Override
    public void notifyObserver(String whatHappened)
    {
        update(whatHappened);
    }
}
