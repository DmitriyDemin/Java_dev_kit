package montyHall;

import java.util.List;
import java.util.Random;

public class Player {

    private Random rnd = new Random();
    private int firstSelection;
    private boolean gameOutcome;
    private boolean firstGameOutcome;
    private List<Door> listDoor;


    public Player(GameBoard board) {
        this.listDoor = board.getBoard();
        this.firstSelection = rnd.nextInt(2);
        this.firstGameOutcome = listDoor.get(firstSelection).isState();
    }

    public boolean getGameOutcome (boolean wishChange){
        listDoor.remove(firstSelection);
        if (wishChange){
            for (Door door: listDoor){
                if (door.isState()) {
                    gameOutcome = true;
                    return gameOutcome;
                }
            }
            gameOutcome = false;

        } else gameOutcome = firstGameOutcome;

        return gameOutcome;
    }






}




