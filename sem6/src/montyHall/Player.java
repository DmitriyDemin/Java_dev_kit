package montyHall;

import java.util.Random;

public class Player {

    private Random rnd = new Random();
    private Integer selection;
    private GameBoard board;
    private boolean win;


    public Player(GameBoard board) {
        this.board = board;
        selection = rnd.nextInt(2);
    }

    public boolean getWin (){
        boolean winPosition = board.getBoard().get(selection).isState();



        return winPosition;
    }








}




