package edu.wctc.maze;

public class InfernalCompanionFactory implements CompanionFactory{
    public Companion getFriendlyCompanion()
    {
        Companion doug = new Companion(){
            public String getName(){
                return "Doug the Devil";
            }
        };
        return doug;
    }
    public Companion getSurlyCompanion()
    {
        Companion ivan = new Companion() {
            public String getName()
            {
                return "Ivan the Imp";
            }
        };
        return ivan;
    }
}
