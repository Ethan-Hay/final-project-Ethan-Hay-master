package edu.wctc.maze;

public class CelestialCompanionFactory implements CompanionFactory {
    public Companion getFriendlyCompanion()
    {
        Companion charles = new Companion(){
            public String getName(){
                return "Charles the Cherub";
            }
        };
        return charles;
    }
    public Companion getSurlyCompanion()
    {
        Companion steve = new Companion() {
            public String getName()
            {
                return "Steve the Seraph";
            }
        };
        return steve;
    }
}
