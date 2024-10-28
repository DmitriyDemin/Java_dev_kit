package game;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 500;
    private static final int WINDOW_WIDHT = 500;
    private static final int WINDOW_POSX = 1400;
    private static final int WINDOW_POSY = 0;

    JButton btnStart = new JButton("New Game");
    JButton btnExit = new JButton("Exit");


    GameWindow(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDHT, WINDOW_HEIGHT);

        setTitle("Димоново окно");
        setResizable(false);/*false заперщает изменение размеров окан*/

        JPanel penBotton = new JPanel(new GridLayout(1, 2));
        penBotton.add(btnStart);
        penBotton.add(btnExit);
        add(penBotton, BorderLayout.SOUTH);


        setVisible(true);/*делает окно прозрачным*/



    }


}
