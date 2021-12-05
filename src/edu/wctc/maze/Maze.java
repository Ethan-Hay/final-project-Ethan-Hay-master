package edu.wctc.maze;

public class Maze {
    private Room currentRoom;

    private Player player = new Player();

    /*
     * Maze receives its starting room from the construction strategy
     * in the Main class.
     */
    public Maze(Room startingRoom) {
        this.currentRoom = startingRoom;
    }

    public String getCurrentRoomDescription() {
        return currentRoom.getDescription();
    }

    public String getCurrentRoomName() {
        return currentRoom.getName().toUpperCase();
    }

    public String getCurrentRoomPossibleDirections() {
        return currentRoom.getPossibleDirections();
    }

    public int getScore() {
        return player.getScore();
    }

    public boolean isPlaying() {
        return player.isPlaying();
    }

    public void performAction(char action) {
        switch (action) {
            case 'u':
            case 'd':
            case 'w':
            case 'e':
            case 's':
            case 'n':
                try {
                    
                    PrintQueue.enqueue("You leave the " + currentRoom.getName());
                    currentRoom = currentRoom.getAdjoiningRoom(action);
                } catch (NoAdjoiningRoomException e) {
                   
                    PrintQueue.enqueue("You can't do that here!");
                }
                break;
            case 'v':
                
                PrintQueue.enqueue(player.getInventory());
                break;
            case 'r': // 'r' recruit companion
                
                currentRoom.recruitCompanion(player);
                break;
            default:
                // 'x' exit
                // 'l' loot
                // 'i' interact
                try {
                    currentRoom.performAction(action, player);
                } catch (InvalidActionException e) {
                    
                    PrintQueue.enqueue("You can't do that here!");
                }
                break;
        }
    }
}
