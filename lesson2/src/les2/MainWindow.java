package les2;

import javax.swing.*;
import java.awt.*;

public class MainWindow  extends JFrame {

    public static void main(String [] args){
        new MainWindow();
    }

    private static final int POS_X = 400;
    private static final int POS_Y = 200;
    private static final int WINDOW_WIDHT = 800;
    private static final int WINDOW_HEIGHT = 600;

    private MainWindow(){
        setDefaultCloseOperation((WindowConstants.EXIT_ON_CLOSE));
        setBounds(POS_X, POS_Y, WINDOW_WIDHT, WINDOW_HEIGHT);
        setTitle("Circles");

        setVisible(true);
        MainCanvas canvas = new MainCanvas(this);
        add(canvas);
        setVisible(true);

    }

    public void oneDrowFrame(MainCanvas canvas, Graphics g, float deltaTime){
        update(canvas, deltaTime);
        render(canvas, g);
    }

    private void update(MainCanvas canvas, float deltaTime){}


    private void render(MainCanvas canvas, Graphics g){}







}
