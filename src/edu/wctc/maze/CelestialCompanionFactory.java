package edu.wctc.maze;

public class CelestialCompanionFactory implements CompanionFactory {
    @Override
    public Companion getFriendlyCompanion()
    {
        return new CharlesCherub();
    }
    @Override
    public Companion getSurlyCompanion()
    {
        return new SteveSeraph();
    }
}
