package montyHall;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameBoard {

    private List<Door> board;

    public GameBoard() {
        this.board = new ArrayList<>();
    }

    public List<Door> fillGameBoard(boolean flag){
    List<Door> board = this.board;
    board.add(new Door(flag));
    if (flag){
        board.add(new Door(false));
        board.add(new Door(false));
    } else {
        Random rnd = new Random();
        boolean flag2 = rnd.nextBoolean();
        board.add(new Door(flag2));
        if (flag2) {
            board.add(new Door(false));
        } else {
            board.add(new Door(true));
        }
    }
    return board;
    }

    public List<Door> getBoard() {
        return board;
    }


}
