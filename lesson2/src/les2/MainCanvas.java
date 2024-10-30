package les2;

import javax.swing.*;
import java.awt.*;

public class MainCanvas extends JPanel {
    private final MainWindow controller;
    private long lastFrameTime;



    MainCanvas(MainWindow controller){
        setBackground(Color.BLUE);
        this.controller = controller;
    }

    @Override
    protected void paintComponent(Graphics g){ // do {
        super.paintComponent(g); //something
//        controller.oneDrowFrame(); // useful - это вариант был на первом этапе построения
        try{ //sleep
            Thread.sleep(16);// 16 mc как лектор расчитал FPC 60
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        float deltaTime = (System.nanoTime()-lastFrameTime) * 0.000000001f;
        controller.oneDrowFrame(this, g, deltaTime);
        lastFrameTime = System.nanoTime();

        repaint(); // while (true)
    }

    public int getLeft(){return 0;}
    public int getRight(){return getWidth()-1;}
    public int getTop(){return 0;}
    public int getBottom(){return getHeight()-1;}


}
