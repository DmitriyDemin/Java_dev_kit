package montyHall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();




        for (int i = 0; i<10 ; i++){
            boolean flag = rnd.nextBoolean();
            boolean wishChange = rnd.nextBoolean();
            GameBoard board = new GameBoard();
            System.out.println(board.fillGameBoard(flag));
//            System.out.println();

            Player pl1 = new Player(board);
            System.out.printf("при желании изменить свой выбор %b, исход игры %b", wishChange, pl1.getGameOutcome(wishChange));
            System.out.println();

        }





    }
}
