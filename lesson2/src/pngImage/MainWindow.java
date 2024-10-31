package pngImage;

import common.CanvasRepainrListener;
import common.Interactable;
import common.MainCanvas;
import common.Sprite;
import firstGame.Background;

import javax.swing.*;
import java.awt.*;

public class MainWindow  extends JFrame implements CanvasRepainrListener {

    public static void main(String [] args){
        new MainWindow();
    }

    private static final int POS_X = 400;
    private static final int POS_Y = 200;
    private static final int WINDOW_WIDHT = 800;
    private static final int WINDOW_HEIGHT = 600;
    private final Interactable[] sprites = new Sprite[100];
    private final Interactable beck = new Background();

    private MainWindow(){
        setDefaultCloseOperation((WindowConstants.EXIT_ON_CLOSE));
        setBounds(POS_X, POS_Y, WINDOW_WIDHT, WINDOW_HEIGHT);
        setTitle("newGame");
        for (int i = 0; i<sprites.length; i++){
            sprites[i] = new Triangle();
        }


        setVisible(true);
        MainCanvas canvas = new MainCanvas(this);
        add(canvas);

        setVisible(true);

    }

    @Override
    public void oneDrowFrame(MainCanvas canvas, Graphics g, float deltaTime){
        update(canvas, deltaTime);
        render(canvas, g);
    }

    private void update(MainCanvas canvas, float deltaTime){
        for (int i = 0; i < sprites.length; i++){
            sprites[i].update(canvas, deltaTime);
        }

        beck.update(canvas, deltaTime);
    }

    private void render(MainCanvas canvas, Graphics g){
        for (int i = 0; i < sprites.length; i++){
            sprites[i].render(canvas,g);
        }

        beck.render(canvas, g);
    }

}
