package edu.wctc.maze;

public class InfernalCompanionFactory implements CompanionFactory{
    @Override
    public Companion getFriendlyCompanion()
    {
       return new DougDevil();
    }
    @Override
    public Companion getSurlyCompanion()
    {
        return new IvanImp();
    }
}
