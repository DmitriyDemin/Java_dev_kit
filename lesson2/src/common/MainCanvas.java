package common;

import javax.swing.*;
import java.awt.*;

public class MainCanvas extends JPanel {

    private final CanvasRepainrListener controller;
    private long lastFrameTime;
    private  Color color;


    public MainCanvas(CanvasRepainrListener controller){
        setBackground(color);
        this.controller = controller;
        lastFrameTime = System.nanoTime();
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

    public void setColor(Color color) {
        this.color = color;
    }
}
