package edu.wctc.maze;
import edu.wctc.maze.roomimpl.*;

public class HardConstruction implements MazeConstructionStrategy{
    public Room createRooms(CompanionFactory factory) {
        Room startingRoom = new DarkRoom();
        startingRoom.setCompanion(factory.getSurlyCompanion());

        Room anotherRoom = new BasicRoom();
        startingRoom.setNorth(anotherRoom);
        anotherRoom.setSouth(startingRoom);

        Room thirdRoom = new SimpleRoom();
        anotherRoom.setDown(thirdRoom);
        thirdRoom.setUp(anotherRoom);

        Room finalRoom = new BasicRoom();
        anotherRoom.setEast(finalRoom);
        finalRoom.setWest(anotherRoom);

        // Return the starting room
        return startingRoom;
    }
}
