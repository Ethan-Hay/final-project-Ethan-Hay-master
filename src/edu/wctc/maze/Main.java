package edu.wctc.maze;


import edu.wctc.maze.io.ConsoleInputService;
import edu.wctc.maze.io.ConsoleOutputService;
import edu.wctc.maze.io.InputService;
import edu.wctc.maze.io.OutputService;

public class Main {
    // Create Room objects and link them together to
    // form a maze
    

    public static void main(String[] args) {
        InputService in = new ConsoleInputService();

        OutputService out = new ConsoleOutputService();

        CompanionFactory factory = new InfernalCompanionFactory();

        ZorkConstructionStrategy zork = new ZorkConstructionStrategy();
        
        Maze maze = new Maze(zork.createRooms(factory));

        while (maze.isPlaying()) {
            out.print(maze.getCurrentRoomName());

            out.print(maze.getCurrentRoomDescription());

            out.print(maze.getCurrentRoomPossibleDirections());

            char command = in.getInput();
            maze.performAction(command);
            PrintQueue.flush();
            
        }

        out.print("GAME OVER");
        out.print("Score: " + maze.getScore());
    }
}
