package montyHall;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();
        boolean flag = rnd.nextBoolean();
        GameBoard board = new GameBoard();

        System.out.println(board.fillGameBoard(flag));

        Player pl1 = new Player(board);
        System.out.println(pl1.getWin());
        Player pl2 = new Player(board);
        System.out.println(pl2.getWin());
        Player pl3 = new Player(board);
        System.out.println(pl3.getWin());


    }
}
